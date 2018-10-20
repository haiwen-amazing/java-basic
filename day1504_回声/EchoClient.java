package day1504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public void start() {
		try {
			Socket s = new Socket(
				"192.168.xxx.xxx", 8000);
			BufferedReader in = 
			 new BufferedReader(
			 new InputStreamReader(
			 s.getInputStream(), "GBK"));
			
			PrintWriter out = 
			 new PrintWriter(
		     new OutputStreamWriter(
		     s.getOutputStream(), "GBK"));   
			
			while(true) {
				System.out.println("输入：");
				String line = new Scanner(System.in).nextLine();
				out.println(line);
				out.flush();
				line = in.readLine();
				if(line == null) {
					break;
				}
				System.out.println("服务器回声："+line);
			}
		} catch (Exception e) {
		}
		
		System.out.println("连接已经断开");
	}
	
	public static void main(String[] args) {
		EchoClient client = new EchoClient();
		client.start();
	}
}






