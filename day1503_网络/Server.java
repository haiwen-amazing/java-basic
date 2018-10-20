package day1503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		//在本机选择端口，启动服务
		ServerSocket ss = 
		 new ServerSocket(8000);
		System.out.println("服务已在8000端口上启动");
		
		//等待客户端发起连接，并建立连接通道
		Socket s = ss.accept();
		System.out.println("客户端已连接");
		
		//取出双向的流
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		/*
		 * 通信协议：通信流程，数据格式
		 *     1.接收数据,单字节的英文字母：hello
		 *     2.发送数据,单字节的英文字母：world
		 */
		for(int i=0;i<5;i++) {
			char c = (char) in.read();
			System.out.print(c);
		}
		
		out.write("world".getBytes());
		out.flush();
		
		s.close();//断开连接
		ss.close();//释放端口，停止服务
	}
}





