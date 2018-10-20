package day0904;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("���룺");
		String s = new Scanner(System.in).nextLine();
		
		if(huiWen(s)) {
			System.out.println("�ǻ���");
		} else {
			System.out.println("���ǻ���");
		}
	}

	private static boolean huiWen(String s) {
		/*
		 * s
		 * "abcddcba"
		 *  i
		 *         j
		 * 
		 * 1. ѭ��i=0,j=s.length()-1,
		 *    i������j�ݼ��������� i<j
		 *    
		 *      2.���iλ���ַ���jλ���ַ������
		 *          3.����false
		 * 
		 * 4.ѭ�������󣬷���true
		 * 
		 * charAt(�±�)
		 */
		for(int i=0, j=s.length()-1; i<j; i++, j--) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		
		return true;
		
	}
}








