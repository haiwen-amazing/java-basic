package day1601;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class ChatClient {
	private BufferedReader in;
	private PrintWriter out;
	private LinkedList<String> list = 
			new LinkedList<>();
	//用户是否正在输入的标记
	private boolean flag = false;
	
	
	public void start() {
		try {
			//连接服务器
			Socket s = new Socket(
					"192.168.31.59",8000);
			in=new BufferedReader(
			   new InputStreamReader(
			   s.getInputStream(), "GBK"));
			out=new PrintWriter(
			    new OutputStreamWriter(
			    s.getOutputStream(), "GBK")); 
			
			//把自己的昵称发给服务器
			System.out.println("您的昵称：");
			String name = new Scanner(System.in).nextLine();
			out.println(name);
			out.flush();
			
			//接收服务器的聊天内容
			new Thread() {
				@Override
				public void run() {
					receive();
				}
			}.start();
			
			//让用户输入聊天内容并发送
			new Thread() {
				@Override
				public void run() {
					input();
				}
			}.start();
			
			//打印线程
			new Thread() {
				@Override
				public void run() {
					print();
				}
			}.start();
		} catch (Exception e) {
			System.out.println(
			 "无法连接服务器，或连接被断开");
		}
	}

	protected void print() {
		//从集合头部移除数据打印
		while(true) {
			synchronized (list) {
				while(flag || list.size() == 0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
					}
				}
				String s = list.removeFirst();
				System.out.println(s);
			}
		}
	}

	protected void input() {
		System.out.println("按回车开始输入聊天内容");
		
		while(true) {
			new Scanner(System.in).nextLine();
			flag = true;//正在输入
			
			System.out.print("输入聊天内容：");
			String s = new Scanner(System.in).nextLine();
			out.println(s);
			out.flush();
			
			flag = false;//输入结束
			//通知正在等待的打印线程
			synchronized (list) {
				list.notifyAll();
			}
		}
	}

	protected void receive() {
		try {
			String line;
			while((line = in.readLine()) != null) {
				synchronized (list) {
					list.add(line);
					list.notifyAll();//在集合上发通知
				}
			}
		} catch (Exception e) {
		}
		
		System.out.println("已经断开连接");
	}
	
	public static void main(String[] args) {
		ChatClient client = new ChatClient();
		client.start();
	}
	
	
}






