package day1002;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//System.out.println("\\a");
		
		
		System.out.println("�������֤�ţ�");
		String s = new Scanner(System.in).nextLine();
		/*
		 * 123456789012345
		 * 123456789012345678
		 * 12345678901234567x
		 * 12345678901234567X
		 * 
		 * |
		 * \d{15}|
		 * \d{15}|\d{17}
		 * \d{15}|\d{17}[\dxX]
		 * 
		 * \\d{15}|\\d{17}[\\dxX]
		 */
		String regex = "\\d{15}|\\d{17}[\\dxX]";
		
		if(s.matches(regex)) {
			System.out.println("��ʽ��ȷ");
		} else {
			System.out.println("��ʽ����");
		}
	}
}
