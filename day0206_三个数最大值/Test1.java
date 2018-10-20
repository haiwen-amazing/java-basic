package day0206;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入三个整数：");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		
		//把三个整数值，传递到f()方法求最大值
		//再得到方法的返回值，存到变量max
		int max = f(a, b, c);
		System.out.println(max);
	}
	
	static int f(int a, int b, int c) {
		//求a,b最大值保存到变量m
		//求m,c最大值保存到变量m
		//int m = a>b ? a : b;
		//m = m>c ? m : c;
		
		int m = a>b ? (a>c?a:c) : (b>c?b:c); 
		
		return m;
	}
	
}




