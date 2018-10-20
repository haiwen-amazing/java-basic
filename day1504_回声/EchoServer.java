package day1504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
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
						System.out.println("一个客户端已连接");
						//把Socket连接交给一个新的通信线程    
						//去执行阻塞的通信操作
						TongXinThread t = new TongXinThread(s);
						t.start();
					}					
				} catch (Exception e) {
					System.out.println(
					 "服务无法启动，或服务已停止");
				}
			}
		}.start();
	}
	
	
	class TongXinThread extends Thread {
		Socket s;
		public TongXinThread(Socket s) {
			this.s = s;
		}
		@Override
		public void run() {
			/*
			 * 针对一个客户端连接，进行通信
			 * 通信协议
			 *     死循环
			 *     1.接收数据
			 *     2.收到的数据，再发回客户端
			 *     
			 *     数据格式
			 *     GBK编码的字符，
			 *     每行字符串末尾，有一个换行符
			 *     
			 *  BR--ISR--网络输入流
			 *  PW--OSW--网络输出流
			 */
			try {
				BufferedReader in = 
				 new BufferedReader(
				 new InputStreamReader(
				 s.getInputStream(), "GBK"));
				
				PrintWriter out = 
				 new PrintWriter(
			     new OutputStreamWriter(
			     s.getOutputStream(), "GBK"));   
				
				String line;
				while((line = in.readLine()) != null) {    
					out.println(line);
					out.flush();
				}
			} catch (Exception e) {
			}
			
			System.out.println("一个客户端断开了");
		}
	}
	
	
	public static void main(String[] args) {
		EchoServer server = new EchoServer();
		server.start();
	}
	
}



