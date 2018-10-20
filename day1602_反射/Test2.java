package day1602;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		Class<?> c = Class.forName(s);
		
		Object o1=null;
		Object o2=null;
		
		try {
			o1 = c.newInstance();
			System.out.println("无参构造： "+o1); 
		} catch (Exception e) {
			System.out.println("没有无参构造");
		}
		
		System.out.println("-----------------");
		
		try {
			//int参数构造方法
			Constructor<?> t = 
			 c.getConstructor(int.class);
			//新建实例，并执行这个构造方法
			o2 = t.newInstance(5);
			System.out.println(
			 "int参数构造方法： "+o2);
		} catch (Exception e) {
			System.out.println("没有int参数构造方法");
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






