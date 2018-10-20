package day0904;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入：");
		String s = new Scanner(System.in).nextLine();
		
		if(huiWen(s)) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
	}

	private static boolean huiWen(String s) {
		/*
		 * s
		 * "abcddcba"
		 *  i
		 *         j
		 * 
		 * 1. 循环i=0,j=s.length()-1,
		 *    i递增，j递减，条件： i<j
		 *    
		 *      2.如果i位置字符与j位置字符不相等
		 *          3.返回false
		 * 
		 * 4.循环结束后，返回true
		 * 
		 * charAt(下标)
		 */
		for(int i=0, j=s.length()-1; i<j; i++, j--) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		
		return true;
		
	}
}








