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
						TongXinThread t = new TongXinThread(s);
						t.start();
						synchronized (list) {
							list.add(t);
						}
					}
				} catch (Exception e) {
					System.out.println(
					 "�޷��������񣬻������ֹͣ");
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
		//������ǰ�ͻ���
		public void send(String msg) {
			if(out != null) {
				out.println(msg);
				out.flush();
			}
		}
		//�������пͻ���
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
				//BR-ISR-������   PW-OSW-������
				in=new BufferedReader(
				   new InputStreamReader(
				   s.getInputStream(), "GBK"));
				out=new PrintWriter(
				    new OutputStreamWriter(
				    s.getOutputStream(), "GBK")); 
				
				//�Ƚ��տͻ��˵��ǳ�
				name = in.readLine();
				//����ǰ�ͻ��˷��ͻ�ӭ��Ϣ
				send(name+"����ӭ���뼤�������ң�");
				//Ⱥ��������Ϣ
				synchronized (list) {
					sendAll(name+"������������,����������"+list.size());      
				}
				
				String line;
				while((line = in.readLine()) != null) {
					sendAll(name+"˵�� "+line);
				}
			} catch (Exception e) {
			}
			//��ǰ�ͻ��˶Ͽ����ѵ�ǰ�̶߳����Ƴ�
			synchronized (list) {
				list.remove(this);
				sendAll(name+"�뿪��������,����������"+list.size());      
			}
		}
	}
	
	public static void main(String[] args) {
		ChatServer server = new ChatServer();
		server.start();
	}
	
	
}





