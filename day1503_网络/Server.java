package day1503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		//�ڱ���ѡ��˿ڣ���������
		ServerSocket ss = 
		 new ServerSocket(8000);
		System.out.println("��������8000�˿�������");
		
		//�ȴ��ͻ��˷������ӣ�����������ͨ��
		Socket s = ss.accept();
		System.out.println("�ͻ���������");
		
		//ȡ��˫�����
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		/*
		 * ͨ��Э�飺ͨ�����̣����ݸ�ʽ
		 *     1.��������,���ֽڵ�Ӣ����ĸ��hello
		 *     2.��������,���ֽڵ�Ӣ����ĸ��world
		 */
		for(int i=0;i<5;i++) {
			char c = (char) in.read();
			System.out.print(c);
		}
		
		out.write("world".getBytes());
		out.flush();
		
		s.close();//�Ͽ�����
		ss.close();//�ͷŶ˿ڣ�ֹͣ����
	}
}





