package day1602;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("����������");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);
		
		Object o1=null;
		Object o2=null;
		
		try {
			o1 = c.newInstance();
			System.out.println("�޲ι��죺 "+o1); 
		} catch (Exception e) {
			System.out.println("û���޲ι���");
		}
		
		System.out.println("-----------------");
		
		try {
			//int�������췽��
			Constructor<?> t = 
			 c.getConstructor(int.class);
			//�½�ʵ������ִ��������췽��
			o2 = t.newInstance(5);
			System.out.println(
			 "int�������췽���� "+o2);
		} catch (Exception e) {
			System.out.println("û��int�������췽��");
		}
		/*
		 * java.lang.Integer(int) 
		 * 
		 * java.util.ArrayList()
		 * java.util.ArrayList(int)
		 * 
		 * java.util.Date()
		 * 
		 */
	}
}






