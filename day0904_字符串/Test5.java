package day0904;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.print("�����ļ�����");
		String s = new Scanner(System.in).nextLine();
		
		if(tuPian(s)) {
			System.out.println("��ͼƬ");
		} else {
			System.out.println("����ͼƬ");
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










