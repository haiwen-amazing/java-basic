package day0308;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("工资：");
		double s = new Scanner(System.in).nextDouble();
		
		double tax = f(s);
		System.out.println(tax);
	}
	
	static double f(double s) {
		if(s<3500) {
			return 0;//没有达到起征点不交税
		}
		
		s -= 3500;//刨掉3500
		
		//税率和速算扣除数变量
		double r = 0;
		int k = 0;
		
		if(s<=1500) {
			r = 0.03;
			k = 0;
		} else if(s<=4500) {
			r = 0.1;
			k = 105;
		} else if(s<=9000) {
			r = 0.2;
			k = 555;
		} else if(s<=35000) {
			r = 0.25;
			k = 1005;
		} else if(s<=55000) {
			r = 0.3;
			k = 2755;
		} else if(s<=80000) {
			r = 0.35;
			k = 5505;
		} else {
			r = 0.45;
			k = 13505;
		}
		
		return s*r - k;
	}
}







