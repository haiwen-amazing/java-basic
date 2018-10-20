package day1601;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	private ArrayList<TongXinThread> list = 
			new ArrayList<>();
	
	public void start() {
		//启动服务线程
		new Thread() {
			@Override
			public void run() {
				try {
					ServerSocket ss = 
					 new ServerSocket(8000);
					System.out.println("服务已启动");
					while(true) {
						Socket s = ss.accept();
						TongXinThread t = new TongXinThread(s);
						t.start();
						synchronized (list) {
							list.add(t);
						}
					}
				} catch (Exception e) {
					System.out.println(
					 "无法启动服务，或服务已停止");
				}
			}
		}.start();
		
	}
	
	class TongXinThread extends Thread {
		Socket s;
		BufferedReader in;
		PrintWriter out;
		public TongXinThread(Socket s) {
			this.s = s;
		}
		//发给当前客户端
		public void send(String msg) {
			if(out != null) {
				out.println(msg);
				out.flush();
			}
		}
		//发给所有客户端
		public void sendAll(String msg) {
			synchronized (list) {
				for (TongXinThread t : list) {
					t.send(msg);
				}
			}
		}
		
		@Override
		public void run() {
			String name = null;
			try {
				//BR-ISR-网络流   PW-OSW-网络流
				in=new BufferedReader(
				   new InputStreamReader(
				   s.getInputStream(), "GBK"));
				out=new PrintWriter(
				    new OutputStreamWriter(
				    s.getOutputStream(), "GBK")); 
				
				//先接收客户端的昵称
				name = in.readLine();
				//给当前客户端发送欢迎信息
				send(name+"，欢迎进入激情聊天室！");
				//群发上线消息
				synchronized (list) {
					sendAll(name+"进入了聊天室,在线人数："+list.size());      
				}
				
				String line;
				while((line = in.readLine()) != null) {
					sendAll(name+"说： "+line);
				}
			} catch (Exception e) {
			}
			//当前客户端断开，把当前线程对象移除
			synchronized (list) {
				list.remove(this);
				sendAll(name+"离开了聊天室,在线人数："+list.size());      
			}
		}
	}
	
	public static void main(String[] args) {
		ChatServer server = new ChatServer();
		server.start();
	}
	
	
}





