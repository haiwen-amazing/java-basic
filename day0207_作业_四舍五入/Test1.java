package day0207;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入浮点数：");
		double a = new Scanner(System.in).nextDouble();
		a = f(a);
		System.out.println(a);
	}
	
	static double f(double a) {
		//5674.45647453
		//5674456.47453
		a = a*1000;
		
		//5674456
		int n = (int) a;
		
		//个位数
		int y = n%10;
		
		if(y<5) {
			n -= y;//舍弃个位
		} else {
			n = n+10-y;//进位
		}
		
		//5674460
		//5674.46
		a = n/1000d;
		return a;
	}
}






