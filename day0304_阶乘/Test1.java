package day0304;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数求阶乘：");
		int n = new Scanner(System.in).nextInt();
		//n的值传递到f()方法求阶乘
		String r = f(n);
		System.out.println(r);
	}
	
	static String f(int n) {
		/*
		 * 求参数n的阶乘
		 * 
		 * 假设n是5
		 * 保存结果的变量 r=5
		 * 
		 * i循环从4到1递减
		 *    i=4, r*=i
		 *    i=3, r*=i
		 *    i=2, r*=i
		 *    i=1, r*=i
		 */
		/*long r = n;
		
		for(int i=n-1; i>=1; i--) {
			r*=i;
		}
		
		return r;*/
		
		BigInteger r = BigInteger.valueOf(n);
		for(int i=n-1; i>=1; i--) {
			r = r.multiply(BigInteger.valueOf(i));
		}
	
		return r.toString();
	}
}





