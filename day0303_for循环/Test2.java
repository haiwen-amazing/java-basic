package day0303;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4();
	}
	static void f1() {
		for(int i=1; i<=3; i++) {
			for(char j='a'; j<='c'; j++) {
				System.out.println(i+", "+j);
			}
		}
	}
	static void f2() {
		/*  i
		 *  1  *****
		 *  2  *****
		 *  3  *****
		 *  4  *****
		 *  n  *****
		 *     1234n j
		 */
		System.out.println("输入大小：");
		int n = new Scanner(System.in).nextInt();
		//i循环，从1到n行
		for(int i=1; i<=n; i++) {
			//j循环，从1到n个星号
			for(int j=1; j<=n; j++) {
				//******* 没有换行
				System.out.print("*");
			}
			System.out.println();//补换行
		}
	}
	
	static void f3() {
		/*    i
		 *    1  *
		 *    2  **
		 *    3  ***
		 *    4  ****
		 *    n  *****
		 *       1234i  j
		 */
		System.out.println("输入大小：");
		int n = new Scanner(System.in).nextInt();
		//i循环，从1到n行
		for(int i=1; i<=n; i++) {
			//j循环，从1到i个星号
			for(int j=1; j<=i; j++) {
				//******* 没有换行
				System.out.print("*");
			}
			System.out.println();//补换行
		}
	}
	
	static void f4() {
		/*   i
		 *   1       *
		 *   2      ***
		 *   3     *****
		 *   4    *******
		 *   n   *********
		 *   
		 *       n-i个空格
		 *       2*i-1个星号
		 */
		System.out.println("输入大小：");
		int n = new Scanner(System.in).nextInt();
		
		//i循环，1到n行
		for(int i=1; i<=n; i++) {
			//j循环，1到n-i个空格
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//j循环，1到2*i-1个星号
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			//补换行
			System.out.println();
		}
	}
}






