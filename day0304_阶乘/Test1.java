package day0304;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����������׳ˣ�");
		int n = new Scanner(System.in).nextInt();
		//n��ֵ���ݵ�f()������׳�
		String r = f(n);
		System.out.println(r);
	}
	
	static String f(int n) {
		/*
		 * �����n�Ľ׳�
		 * 
		 * ����n��5
		 * �������ı��� r=5
		 * 
		 * iѭ����4��1�ݼ�
		 *    i=4, r*=i
		 *    i=3, r*=i
		 *    i=2, r*=i
		 *    i=1, r*=i
		 */
		/*long r = n;
		
		for(int i=n-1; i>=1; i--) {
			r*=i;
		}
		
		return r;*/
		
		BigInteger r = BigInteger.valueOf(n);
		for(int i=n-1; i>=1; i--) {
			r = r.multiply(BigInteger.valueOf(i));
		}
	
		return r.toString();
	}
}





