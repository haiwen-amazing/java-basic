package day0206;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("��������������");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		
		//����������ֵ�����ݵ�f()���������ֵ
		//�ٵõ������ķ���ֵ���浽����max
		int max = f(a, b, c);
		System.out.println(max);
	}
	
	static int f(int a, int b, int c) {
		//��a,b���ֵ���浽����m
		//��m,c���ֵ���浽����m
		//int m = a>b ? a : b;
		//m = m>c ? m : c;
		
		int m = a>b ? (a>c?a:c) : (b>c?b:c); 
		
		return m;
	}
	
}




