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
	//�û��Ƿ���������ı��
	private boolean flag = false;
	
	
	public void start() {
		try {
			//���ӷ�����
			Socket s = new Socket(
					"192.168.31.59",8000);
			in=new BufferedReader(
			   new InputStreamReader(
			   s.getInputStream(), "GBK"));
			out=new PrintWriter(
			    new OutputStreamWriter(
			    s.getOutputStream(), "GBK")); 
			
			//���Լ����ǳƷ���������
			System.out.println("�����ǳƣ�");
			String name = new Scanner(System.in).nextLine();
			out.println(name);
			out.flush();
			
			//���շ���������������
			new Thread() {
				@Override
				public void run() {
					receive();
				}
			}.start();
			
			//���û������������ݲ�����
			new Thread() {
				@Override
				public void run() {
					input();
				}
			}.start();
			
			//��ӡ�߳�
			new Thread() {
				@Override
				public void run() {
					print();
				}
			}.start();
		} catch (Exception e) {
			System.out.println(
			 "�޷����ӷ������������ӱ��Ͽ�");
		}
	}

	protected void print() {
		//�Ӽ���ͷ���Ƴ����ݴ�ӡ
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
		System.out.println("���س���ʼ������������");
		
		while(true) {
			new Scanner(System.in).nextLine();
			flag = true;//��������
			
			System.out.print("�����������ݣ�");
			String s = new Scanner(System.in).nextLine();
			out.println(s);
			out.flush();
			
			flag = false;//�������
			//֪ͨ���ڵȴ��Ĵ�ӡ�߳�
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
					list.notifyAll();//�ڼ����Ϸ�֪ͨ
				}
			}
		} catch (Exception e) {
		}
		
		System.out.println("�Ѿ��Ͽ�����");
	}
	
	public static void main(String[] args) {
		ChatClient client = new ChatClient();
		client.start();
	}
	
	
}






