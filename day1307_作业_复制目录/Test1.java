package day1307;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("原文件夹：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isDirectory()) {
			System.out.println("原文件夹错误");
			return;
		}
		
		System.out.println("目标文件夹：");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.exists()) {
			System.out.println("目标文件夹已经存在");
			return;
		}
		
		try {
			copy(from, to);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void copy(
			File fromDir, File toDir) throws Exception{
		//对原文件夹列表
		File[] files = fromDir.listFiles();
		if(files == null) {
			throw new IOException("无法复制原文件夹");
		}
		
		//创建目标文件夹
		if(! toDir.mkdirs()) {
			throw new IOException("无法创建文件夹");
		}
		
		//遍历子文件和子目录
		for (File f : files) {
			if(f.isFile()) {
				copyFile(f, new File(toDir, f.getName()));
			} else {
				copy(f, new File(toDir, f.getName()));
			}
		}
	}

	private static void copyFile(
			File from, File to) throws Exception {
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to);
		byte[] buff = new byte[8192];
		int n;
		while((n = in.read(buff)) != -1) {
			out.write(buff, 0, n);
		}
		in.close();
		out.close();
	}
}








