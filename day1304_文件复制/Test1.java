package day1304;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("ԭ�ļ���");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("�����ļ�");
			return;
		}
		
		System.out.println("Ŀ���ļ���");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println("�������ļ���");
			return;
		}
		
		try {
			copy(from, to);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();//��ӡ�����쳣��Ϣ
		}
	}

	private static void copy(
			File from, File to) throws Exception {
		/*
		 * 1.�½��ļ�������in����from�ļ�
		 *   FIS -- from
		 *   
		 * 2.�½��ļ������out����to�ļ�
		 *   FOS -- to
		 * 
		 * 3.���ֽ�ѭ����ȡ
		 *     4.������ֽ�ֵ������������
		 *  
		 * 5.in.close()
		 *   out.close()
		 */
		
		// BIS--FIS--from
		BufferedInputStream in =
		 new BufferedInputStream(
		 new FileInputStream(from));
		
		// BOS--FOS--to
		BufferedOutputStream out =
		 new BufferedOutputStream(
		 new FileOutputStream(to));
		
		int b;
		while((b = in.read()) != -1) {
			out.write(b);
		}
		
		// 8*1024
		//byte[] buff = new byte[8192];
		//int n;//����ÿһ��������
		//while((n = in.read(buff)) != -1) {
		//	out.write(buff, 0, n);
		//}
		
		in.close();
		out.close();
		
	}
}











