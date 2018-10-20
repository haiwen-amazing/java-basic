package day1007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println(
		 "出生日期(yyyy-MM-dd):");
		String s = new Scanner(System.in).nextLine();
		/*
		 * "1997-1-12" 解析成 Date 对象
		 * 并取出对象中的毫秒值
		 */
		SimpleDateFormat f = 
		 new SimpleDateFormat("yyyy-MM-dd");
		/*
		 * 鼠标提示，选择 add throws ...
		 */
		Date d = f.parse(s);
		
		long t = System.currentTimeMillis()-d.getTime();
		t = t/1000/60/60/24;
		System.out.println("您已经生存了 "+t+" 天");
		
	}
}





