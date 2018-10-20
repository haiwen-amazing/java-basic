package day0506;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("玩几层汉诺塔：");
		int n = new Scanner(System.in).nextInt();
		f(n, "A", "B", "C");
	}

	private static void f(
			int n,String z1,String z2,String z3) {
		/*
		 * n层从z1到z2到z3
		 * 
		 * 0. 一层，从z1到z3
		 * 1. 上面的n-1层从z1到z3到z2
		 * 2. 最底下一层从z1到z3
		 * 3. z2上的n-1层从c2到z1到z3
		 */
		if(n==1) {
			System.out.println(z1+"-->"+z3);
			return;
		}
		f(n-1, z1, z3, z2);
		System.out.println(z1+"-->"+z3);
		f(n-1, z2, z1, z3);
	}
}





