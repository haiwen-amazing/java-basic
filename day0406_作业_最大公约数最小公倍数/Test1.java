package day0406;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入两个整数：");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		int y = f1(a, b);
		long s = f2(a, b);
		System.out.println(y);
		System.out.println(s);
	}

	private static int f1(int a, int b) {
		//最大公约数
		int min = a<b ? a : b;
		for(int i=min; i>=1; i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		
		return 1;//逻辑上不可能执行，让编译可以通过
	}

	private static long f2(int a, int b) {
		//最小公倍数
		int max = a>b ? a : b;
		for(long i=max; ;i+=max) {
			if(i%a==0 && i%b==0) {
				return i;
			}
		}
	}
}









