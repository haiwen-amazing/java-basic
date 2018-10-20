package day1203;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		try {
			f();
		} catch (ParseException e) {
			System.out.println("日期格式错误");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("无法创建文件");
		}
	}

	private static void f() throws ParseException,IOException {  
		System.out.print("生日(yyyy-MM-dd)：");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat f = 
		 new SimpleDateFormat("yyyy-MM-dd");
		Date d = f.parse(s);
		long t = d.getTime();
		//  d:\435624634653456.txt
		String path = "d:\\"+t+".txt";
		File file = new File(path);
		file.createNewFile();
		System.out.println("已创建文件："+path);
	}
}







