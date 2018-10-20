package day1403;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		//main�߳�
		System.out.println("���س�ͱ��t1�߳�");
		new Scanner(System.in).nextLine();
		
		t1.interrupt();
		
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			SimpleDateFormat f = 
			 new SimpleDateFormat("HH:mm:ss");
			while(true) {
				System.out.println(
				 f.format(new Date()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {    
					System.out.println("˭TMDͱ��������");
					break;
				}
			}
		}
	}
}







