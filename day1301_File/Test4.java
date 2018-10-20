package day1301;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入文件夹：");
		String path = new Scanner(System.in).nextLine();
		
		File dir = new File(path);
		/*
		 * 文件夹不存在，没有权限进入文件夹
		 * 会得到null值
		 */
		String[] names = dir.list();
		File[] files = dir.listFiles();
		
		//for-each格式语法
		//数组下标遍历语法格式进行了简化
		//本质就是下标遍历		
		for(String s : names) {
			System.out.println(s);
		}
		
		for(File f : files) {
			System.out.println(
			 f.getName()+" - "+f.length());
		}
		
		
	}
}








