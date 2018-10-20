package day1503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws Exception {
		//向服务器发起连接
		Socket s =
		 new Socket("127.0.0.1", 8000);
		
		//双向的流
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		/*
		 * 通信协议
		 *     1.发送 hello
		 *     2.接收五个字节的英文字母
		 */
		out.write("hello".getBytes());
		out.flush();
		
		for(int i=0;i<5;i++) {
			char c = (char)in.read();
			System.out.print(c);
		}
		
		//断开连接
		s.close();
		
	}
}






