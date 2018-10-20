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
		System.out.println("�����С��");
		int n = new Scanner(System.in).nextInt();
		//iѭ������1��n��
		for(int i=1; i<=n; i++) {
			//jѭ������1��n���Ǻ�
			for(int j=1; j<=n; j++) {
				//******* û�л���
				System.out.print("*");
			}
			System.out.println();//������
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
		System.out.println("�����С��");
		int n = new Scanner(System.in).nextInt();
		//iѭ������1��n��
		for(int i=1; i<=n; i++) {
			//jѭ������1��i���Ǻ�
			for(int j=1; j<=i; j++) {
				//******* û�л���
				System.out.print("*");
			}
			System.out.println();//������
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
		 *       n-i���ո�
		 *       2*i-1���Ǻ�
		 */
		System.out.println("�����С��");
		int n = new Scanner(System.in).nextInt();
		
		//iѭ����1��n��
		for(int i=1; i<=n; i++) {
			//jѭ����1��n-i���ո�
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//jѭ����1��2*i-1���Ǻ�
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			//������
			System.out.println();
		}
	}
}






