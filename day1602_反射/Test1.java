package day1602;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		System.out.println("��������������");
		String s = new Scanner(System.in).nextLine();
		//��������
		Class<?> c = Class.forName(s);
		/*
		 * java.lang.String
		 * java.lang.Integer
		 * java.util.Date
		 * java.util.ArrayList
		 * java.io.File
		 */
		
		//����������
		System.out.println(c.getPackage().getName());
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
		System.out.println("\n\n--��Ա����--------------");
		f1(c);
		System.out.println("\n\n--���췽��--------------");
		f2(c);
		System.out.println("\n\n--����--------------");
		f3(c);
	}

	private static void f1(Class<?> c) {
		/*
		 * Field���󣬷�װ�����Ķ�����Ϣ
		 * private static final String s
		 */
		Field[] a = c.getDeclaredFields();
		for (Field f : a) {
			//����
			String t = f.getType().getSimpleName();
			//������
			String n = f.getName();
			System.out.println(t+" "+n);
		}
	}

	private static void f2(Class<?> c) {
		/*
		 * Constructor���󣬷�װ���췽��������Ϣ
		 * public A(����) throws �쳣
		 */
		Constructor<?>[] a = c.getDeclaredConstructors();
		for (Constructor<?> t : a) {
			//����
			String n = c.getSimpleName();
			//�����б�
			Class<?>[] p = t.getParameterTypes();
			System.out.println(
				n+"("+ Arrays.toString(p) +")");
		}
	}

	private static void f3(Class<?> c) {
		/*
		 * Method���󣬷�װ�����Ķ�����Ϣ
		 * public static Date f(����) throws �쳣
		 */
		Method[] a = c.getDeclaredMethods();
		for (Method t : a) {
			//��������
			String r = 
			 t.getReturnType().getSimpleName();
			//������
			String n = t.getName();
			//�����б�
			Class<?>[] p = t.getParameterTypes();
			System.out.println(
			 r+" "+n+"("+ Arrays.toString(p) +")");
			
		}
	}
}







