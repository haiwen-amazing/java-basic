package day1602;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入完整类名：");
		String s = new Scanner(System.in).nextLine();
		//获得类对象
		Class<?> c = Class.forName(s);
		/*
		 * java.lang.String
		 * java.lang.Integer
		 * java.util.Date
		 * java.util.ArrayList
		 * java.io.File
		 */
		
		//包名、类名
		System.out.println(c.getPackage().getName());
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
		System.out.println("\n\n--成员变量--------------");
		f1(c);
		System.out.println("\n\n--构造方法--------------");
		f2(c);
		System.out.println("\n\n--方法--------------");
		f3(c);
	}

	private static void f1(Class<?> c) {
		/*
		 * Field对象，封装变量的定义信息
		 * private static final String s
		 */
		Field[] a = c.getDeclaredFields();
		for (Field f : a) {
			//类型
			String t = f.getType().getSimpleName();
			//变量名
			String n = f.getName();
			System.out.println(t+" "+n);
		}
	}

	private static void f2(Class<?> c) {
		/*
		 * Constructor对象，封装构造方法定义信息
		 * public A(参数) throws 异常
		 */
		Constructor<?>[] a = c.getDeclaredConstructors();
		for (Constructor<?> t : a) {
			//名字
			String n = c.getSimpleName();
			//参数列表
			Class<?>[] p = t.getParameterTypes();
			System.out.println(
				n+"("+ Arrays.toString(p) +")");
		}
	}

	private static void f3(Class<?> c) {
		/*
		 * Method对象，封装方法的定义信息
		 * public static Date f(参数) throws 异常
		 */
		Method[] a = c.getDeclaredMethods();
		for (Method t : a) {
			//返回类型
			String r = 
			 t.getReturnType().getSimpleName();
			//方法名
			String n = t.getName();
			//参数列表
			Class<?>[] p = t.getParameterTypes();
			System.out.println(
			 r+" "+n+"("+ Arrays.toString(p) +")");
			
		}
	}
}







