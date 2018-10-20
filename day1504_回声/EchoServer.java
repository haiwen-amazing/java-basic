package day1504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void start() {
		//���������߳�
		new Thread() {
			@Override
			public void run() {
				try {
					ServerSocket ss = 
					 new ServerSocket(8000);     
					System.out.println("����������");
					while(true) {
						Socket s = ss.accept();   
						System.out.println("һ���ͻ���������");
						//��Socket���ӽ���һ���µ�ͨ���߳�    
						//ȥִ��������ͨ�Ų���
						TongXinThread t = new TongXinThread(s);
						t.start();
					}					
				} catch (Exception e) {
					System.out.println(
					 "�����޷��������������ֹͣ");
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
			 * ���һ���ͻ������ӣ�����ͨ��
			 * ͨ��Э��
			 *     ��ѭ��
			 *     1.��������
			 *     2.�յ������ݣ��ٷ��ؿͻ���
			 *     
			 *     ���ݸ�ʽ
			 *     GBK������ַ���
			 *     ÿ���ַ���ĩβ����һ�����з�
			 *     
			 *  BR--ISR--����������
			 *  PW--OSW--���������
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
			
			System.out.println("һ���ͻ��˶Ͽ���");
		}
	}
	
	
	public static void main(String[] args) {
		EchoServer server = new EchoServer();
		server.start();
	}
	
}



