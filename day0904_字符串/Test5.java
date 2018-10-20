package day0904;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.print("输入文件名：");
		String s = new Scanner(System.in).nextLine();
		
		if(tuPian(s)) {
			System.out.println("是图片");
		} else {
			System.out.println("不是图片");
		}
	}

	private static boolean tuPian(String s) {
		/*
		 * sdfs.sdfs.jpg
		 *          ||
		 *      index+1
		 */
		int index = s.lastIndexOf(".");
		if(index == -1) {
			return false;
		}
		String h = s.substring(index+1);
		if(h.equalsIgnoreCase("jpg") ||
		   h.equalsIgnoreCase("png") ||
		   h.equalsIgnoreCase("gif") ||
		   h.equalsIgnoreCase("bmp")) {
			return true;
		}
		
		return false;		
	}
}










