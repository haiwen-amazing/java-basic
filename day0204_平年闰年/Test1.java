package day0204;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("年号：");
		int y = new Scanner(System.in).nextInt();
		//把y的值，传递到f()方法进行运算
		//再获得该方法的返回值
		boolean b = f(y);
		//如果变量b的值是真
		if(b) {
			System.out.println("闰年");
		} else {
			System.out.println("平年");
		}
	}
	
	/*
	 * 对接收的参数y的值进行判断，
	 * 判断它是否是闰年
	 * 
	 * 闰年： 
	 *     * 能被4整除，并且不能被100整除
	 *     * 能被400整除
	 *     
	 *     2000 闰年
	 *     1000 平年
	 *     2016 闰年
	 *     2018 平年
	 */
	static boolean f(int y) {
		//定义布尔值变量，保存结果
		boolean r = false;
		//如果y能被4整除
		/*if(y%4 == 0) {
			//能被4整除的情况下
			//进一步判断，不能被100整除
			if(y%100 != 0) {
				r = true;//是闰年
			}
		}
		//如果能被400整除
		if(y%400 == 0) {
			r = true;//是闰年
		}*/
		
		//能被4整除并且不能被100整除
		//或者，能被400整除
		if((y%4==0 && y%100!=0) || y%400==0) {
			r = true;//是闰年
		}
		
		//返回变量r的值
		return r;
	}
	
}







