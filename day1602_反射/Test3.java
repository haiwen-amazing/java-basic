package day1602;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Class<Integer> c = Integer.class;
		Integer i = Integer.valueOf(5);
		
		Field f = c.getDeclaredField("value");
		
		//ʹ˽�б������Է���
		f.setAccessible(true);
		
		//���ʱ�����ֵ
		System.out.println(f.get(i));
		
		//���ñ�����ֵ
		f.set(i, 55);
		System.out.println(i.intValue());
		
	}
}






