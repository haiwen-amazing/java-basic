package day1602;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Class<Integer> c = Integer.class;
		Integer i = Integer.valueOf(5);
		
		Field f = c.getDeclaredField("value");
		
		//使私有变量可以访问
		f.setAccessible(true);
		
		//访问变量的值
		System.out.println(f.get(i));
		
		//设置变量的值
		f.set(i, 55);
		System.out.println(i.intValue());
		
	}
}






