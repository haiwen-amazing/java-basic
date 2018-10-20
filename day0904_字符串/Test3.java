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
		 *  1. ��e�ַ����У�����@��λ�ã����浽index   
		 *  2. ���index==-1������"��ʽ����"
		 *  3. ��ȡ������ [0, index) ��Χ���Ӵ�
		 *  
		 *  indexOf(�Ӵ�)
		 *  substring(start, end)
		 */
		
		e = e.trim();
		
		int index = e.indexOf("@");
		if(index == -1) {
			return "��ʽ����";
		}
		return e.substring(0, index);
		
	}
}









