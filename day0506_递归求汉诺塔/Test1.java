package day0506;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("�漸�㺺ŵ����");
		int n = new Scanner(System.in).nextInt();
		f(n, "A", "B", "C");
	}

	private static void f(
			int n,String z1,String z2,String z3) {
		/*
		 * n���z1��z2��z3
		 * 
		 * 0. һ�㣬��z1��z3
		 * 1. �����n-1���z1��z3��z2
		 * 2. �����һ���z1��z3
		 * 3. z2�ϵ�n-1���c2��z1��z3
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





