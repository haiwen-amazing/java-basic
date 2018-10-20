package day1503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws Exception {
		//���������������
		Socket s =
		 new Socket("127.0.0.1", 8000);
		
		//˫�����
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		/*
		 * ͨ��Э��
		 *     1.���� hello
		 *     2.��������ֽڵ�Ӣ����ĸ
		 */
		out.write("hello".getBytes());
		out.flush();
		
		for(int i=0;i<5;i++) {
			char c = (char)in.read();
			System.out.print(c);
		}
		
		//�Ͽ�����
		s.close();
		
	}
}






