package day1304;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
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
		
		try {
			copy(from, to);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();//打印完整异常信息
		}
	}

	private static void copy(
			File from, File to) throws Exception {
		/*
		 * 1.新建文件输入流in插在from文件
		 *   FIS -- from
		 *   
		 * 2.新建文件输出流out插在to文件
		 *   FOS -- to
		 * 
		 * 3.单字节循环读取
		 *     4.把这个字节值，向输出流输出
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
		//int n;//保存每一批的数量
		//while((n = in.read(buff)) != -1) {
		//	out.write(buff, 0, n);
		//}
		
		in.close();
		out.close();
		
	}
}











