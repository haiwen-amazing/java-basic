package day0401;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("输入整数n求n内质数的数量：");
		int n = new Scanner(System.in).nextInt();
		
		int r = f(n);
		System.out.println(r);
	}
	
	static int f(int n) {
		if(n<2) {
			return 0;
		}
		//定义计数变量count
		//从1开始，因为有一个质数是已知的
		int count = 1;
		
		//i循环从3到n范围内寻找质数
		outer:
		for(int i=3; i<=n; i++) {
			//判断i是否是质数
			double max = 1+Math.sqrt(i);
			for(int j=2; j<max; j++) {
				if(i%j == 0) {
					//i不是质数，跳到i++再判断下一个i值
					continue outer;
				}
			}
			count++;//i是质数，计数值增加
		}
		
		return count;
	}
}






