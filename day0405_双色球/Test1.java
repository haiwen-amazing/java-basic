package day0405;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * ��������r
		 * [1,2,3,4,5,6..., 33]
		 * 
		 * ��������b
		 * [1,2,3..., 16]
		 */
		//���÷������������
		int[] r = f(33);
		int[] b = f(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		
		//��r���飬ѡ��6������
		int[] red = selectRed(r);
		//��b���飬ѡ��1������
		int blue = selectBlue(b);
		System.out.println(Arrays.toString(red));
		System.out.println(blue);
	}
	
	static int[] selectRed(int[] r) {
		/*
		 * r
		 *                              j                                        
		 * [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33]
		 *        i
		 */
		//iѭ������ǰ6��λ��
		for(int i=0; i<6; i++) {
			//i+[0, 33-i) ---> [i, 33)
			int j = i+new Random().nextInt(33-i);
			//��������r��i��jλ�õ�ֵ
			swap(r, i, j);
		}
		//������r��ȡǰ6��λ�ã�����һ��������
		r = Arrays.copyOf(r, 6);
		return r;
	}
	
	static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	static int selectBlue(int[] b) {
		return b[new Random().nextInt(16)];
	}
	
	static int[] f(int n) {
		//�½�int[]���鱣�浽����a��������n
		int[] a = new int[n];
		//����
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
		}
		//��������a
		return a;
	}
	
}




