package day1301;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.新建 d:\abc 文件夹
		 * 2.在abc文件夹，新建 f1 文件
		 * 3.删除f1文件
		 * 4.删除abc目录
		 */
		System.out.println("按回车");
		new Scanner(System.in).nextLine();		
		File dir = new File("d:/abc");
		dir.mkdirs();		
		new Scanner(System.in).nextLine();		
		File f = new File("d:/abc/f1");
		f.createNewFile();
		new Scanner(System.in).nextLine();		
		f.delete();
		new Scanner(System.in).nextLine();		
		dir.delete();
		
	}
}




