package day0302;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入百分制分数：");
		int s = new Scanner(System.in).nextInt();
		if (s < 0 || s > 100) {
			System.out.println("输入错误");
			return;// 方法到此结束
		}
		// s的值，传递到f()方法进行计算
		// 再得到该方法的返回值保存到变量r
		char r = f(s);
		System.out.println(r);
	}

	static char f(int s) {
		// 定义变量，用来保存结果
		char r = 0;
		// 根据s的值，来确定r的值
		switch (s / 10) {
		case 10:
		case 9:
			r = 'A';
			break;
		case 8:
		case 7:
			r = 'B';
			break;
		case 6:
			r = 'C';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
			r = 'D';
			break;
		case 1:
		case 0:
			r = 'E';
			break;
		}
		return r;
	}

}
