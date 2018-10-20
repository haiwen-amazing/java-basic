package day0401;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//提示用户输入一个整数
		//得到输入的值保存到变量i
		//把i传递到f()方法判断它是否是质数
		//再得到该方法返回的布尔值保存到变量b
		System.out.println("输入一个整数：");
		int i = new Scanner(System.in).nextInt();
		boolean b = f(i);
		System.out.println(b);
	}
	
	static boolean f(int i) {
		if(i==2) {
			return true;
		}
		if(i<2) {
			return false;
		}
		
		/*
		 * 判断i是否是质数
		 * 循环从2到 1+根号i，
		 * 找能把i整除的值
		 * 找到，i不是质数
		 * 找不到，i是质数
		 */
		double max = 1 + Math.sqrt(i);
		for(int j=2; j<max; j++) {
			if(i%j == 0) {
				return false;
			}
		}
		return true;
	}
}




