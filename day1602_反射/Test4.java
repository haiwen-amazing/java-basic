package day1602;

import java.lang.reflect.Method;
import java.util.Date;

public class Test4 {
	public static void main(String[] args) throws Exception {
		Class<Date> c = Date.class;
		Date d = new Date();
		
		Method getTime = 
		 c.getMethod("getTime");
		Method setTime = 
		 c.getMethod("setTime", long.class);
		//调用getTime方法
		Object r = getTime.invoke(d);
		System.out.println(r);
		//调用setTime方法
		setTime.invoke(d, 900000000000L);
		
		System.out.println(d);
		
		
	}
}







