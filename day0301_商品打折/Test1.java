package day0301;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入原价：");
		//获得输入的值
		//再保存到变量p
		double p = 
		 new Scanner(System.in).nextDouble();
		
		//p的值，传递到discount()方法来计算折扣价
		p = discount(p);
		System.out.println("折扣价："+p);
	}
	
	static double discount(double p) {
		//折扣变量
		double d = 1;
		//根据原价p的值，来确定折扣比例
		if(p>=5000) {
			d = 0.75;
		} else if(p>=3000) {
			d = 0.8;
		} else if(p>=1000) {
			d = 0.85;
		} else if(p>=500) {
			d = 0.9;
		}
		return p*d;
	}
}







