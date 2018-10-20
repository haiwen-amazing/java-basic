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
		System.out.println("原文件：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("不是文件");
			return;
		}
		
		System.out.println("目标文件：");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println("不能是文件夹");
			return;
		}
		
		System.out.println("原文件编码：");
		String fromEncoding = new Scanner(System.in).nextLine();
		System.out.println("目标文件编码：");
		String toEncoding = new Scanner(System.in).nextLine();
		
		try {
			copy(from, to, fromEncoding, toEncoding);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void copy(File from, File to, String fromEncoding, String toEncoding) throws Exception {
		/*
		 * 原文件的流，编码是fromEncoding
		 * ISR--FIS--from
		 * 
		 * 目标文件的流，编码是toEncoding
		 * OSW--FOS--to
		 * 
		 * 用char[]数组，批量读写(参考昨天的copy())
		 * 
		 * 把两个流关闭
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








