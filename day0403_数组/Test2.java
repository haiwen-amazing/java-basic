package day0403;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		//�½�10�����ȵ�int[]����
		//�ٰ������ڴ��ַ���浽����a
		int[] a = new int[10];
		
		//�������飬����1,2,3,4...10
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
		}
		System.out.println(Arrays.toString(a));
		
		//���������������ݵ�ƽ��ֵ
		double p = f1(a);
		System.out.println("ƽ��ֵ��"+p);
		
		//����a������ 3,4λ�õ�ֵ
		swap(a, 3, 4);
		System.out.println(Arrays.toString(a));
	}
	
	static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	static double f1(int[] a) {
		/*
		 * ƽ��
		 * 
		 * �������飬�ۼ����е�ֵ��
		 * �ٳ����鳤����ƽ��ֵ
		 */
		//�����ۼӱ���
		double sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}



