package day1203;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while(true) {
			try {
				f();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("输入两个！");
				e.printStackTrace();//打印完整异常信息
			} catch (ArithmeticException e) {
				System.out.println("不能除0！");
			} catch (Exception e) {
				System.out.println("出错，请重试！");
			} finally {
				System.out.println("---------------");
			}
		}
		
		
	}

	private static void f() {
		/*
		 * "345,5"
		 * ["345",  "5"]
		 * 345      5
		 * 345/5
		 * 
		 * 6343,65
		 * 345
		 * abc,def
		 * 345,0
		 */
		System.out.print("输入逗号隔开的两个整数：");
		String s = new Scanner(System.in).nextLine();
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1/n2;
		System.out.println(r);
	}
}








