package day1203;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		List<String> list = new ArrayList<>();
		Collections.addAll(
		 list, 
		 "2018-8-15","2018-8-2","2018-8-21",
		 "2018-8-3","2018-8-30","2018-8-9",
		 "dsfasdfasdfasdf",
		 "2018-8-1");
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				SimpleDateFormat f = 
				 new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date d1 = f.parse(o1);
					Date d2 = f.parse(o2);
					return d1.compareTo(d2);
				} catch (ParseException e) {
					//捕获的异常对象，包装成能抛出的类型，再抛出
					//main->f()->sort()->compare()
					throw new RuntimeException("日期格式错误", e);
				}
			}
		});
		System.out.println(list);
	}
}







