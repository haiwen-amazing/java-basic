package day1007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println(
		 "��������(yyyy-MM-dd):");
		String s = new Scanner(System.in).nextLine();
		/*
		 * "1997-1-12" ������ Date ����
		 * ��ȡ�������еĺ���ֵ
		 */
		SimpleDateFormat f = 
		 new SimpleDateFormat("yyyy-MM-dd");
		/*
		 * �����ʾ��ѡ�� add throws ...
		 */
		Date d = f.parse(s);
		
		long t = System.currentTimeMillis()-d.getTime();
		t = t/1000/60/60/24;
		System.out.println("���Ѿ������� "+t+" ��");
		
	}
}





