package day0904;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("email:");
		String e = new Scanner(System.in).nextLine();
		String n = getName(e);
		System.out.println(n);
	}

	private static String getName(String e) {
		/*
		 * e
		 * "abc@def.com"
		 *  |  |
		 *  0  index
		 *  
		 *  1. 从e字符串中，查找@的位置，保存到index   
		 *  2. 如果index==-1，返回"格式错误"
		 *  3. 截取并返回 [0, index) 范围的子串
		 *  
		 *  indexOf(子串)
		 *  substring(start, end)
		 */
		
		e = e.trim();
		
		int index = e.indexOf("@");
		if(index == -1) {
			return "格式错误";
		}
		return e.substring(0, index);
		
	}
}









