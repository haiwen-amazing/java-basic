package day1104;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("���룺");
		String s = new Scanner(System.in).nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		/*
		 * sdfasdsasf
		 *    i
		 *    
		 * a
		 * 
		 * 1. iѭ�������ַ���s
		 *     2. ��sȡ��iλ���ַ��浽����c
		 *     3. ��mapȡ���ַ�c��Ӧ�ļ���ֵ
		 *        �浽����Integer count
		 *     4. ���count==null
		 *          5. ��map�з���c��1
		 *     6. ����
		 *          7. ��map�з���c��count+1
		 * 
		 * 8. ��ӡmap
		 */
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			Integer count = map.get(c);
			if(count == null) {
				map.put(c, 1);
			} else {
				map.put(c, count+1);
			}
		}
		
		System.out.println(map);
	}
}






