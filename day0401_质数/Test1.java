package day0401;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//��ʾ�û�����һ������
		//�õ������ֵ���浽����i
		//��i���ݵ�f()�����ж����Ƿ�������
		//�ٵõ��÷������صĲ���ֵ���浽����b
		System.out.println("����һ��������");
		int i = new Scanner(System.in).nextInt();
		boolean b = f(i);
		System.out.println(b);
	}
	
	static boolean f(int i) {
		if(i==2) {
			return true;
		}
		if(i<2) {
			return false;
		}
		
		/*
		 * �ж�i�Ƿ�������
		 * ѭ����2�� 1+����i��
		 * ���ܰ�i������ֵ
		 * �ҵ���i��������
		 * �Ҳ�����i������
		 */
		double max = 1 + Math.sqrt(i);
		for(int j=2; j<max; j++) {
			if(i%j == 0) {
				return false;
			}
		}
		return true;
	}
}




