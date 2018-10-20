package day1402;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Test2 {
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
		
		System.out.println("ԭ�ļ����룺");
		String fromEncoding = new Scanner(System.in).nextLine();
		System.out.println("Ŀ���ļ����룺");
		String toEncoding = new Scanner(System.in).nextLine();
		
		try {
			copy(from, to, fromEncoding, toEncoding);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
	}

	private static void copy(File from, File to, String fromEncoding, String toEncoding) throws Exception {
		/*
		 * ԭ�ļ�������������fromEncoding
		 * ISR--FIS--from
		 * 
		 * Ŀ���ļ�������������toEncoding
		 * OSW--FOS--to
		 * 
		 * ��char[]���飬������д(�ο������copy())
		 * 
		 * ���������ر�
		 */
		BufferedReader in = 
		 new BufferedReader(
		 new InputStreamReader(
		 new FileInputStream(from), fromEncoding));     
		
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 new FileOutputStream(to), toEncoding));
		
		/*char[] buff = new char[8192];
		int n;
		while((n = in.read(buff)) != -1) {
			out.write(buff, 0, n);
		}*/
		
		String line;
		while((line = in.readLine()) != null) {
			out.println(line);
		}
		
		in.close();
		out.close();
	}
}








