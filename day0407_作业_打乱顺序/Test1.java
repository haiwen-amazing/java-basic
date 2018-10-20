package day0407;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//1��100
		int[] a = f1();
		System.out.println(Arrays.toString(a));
		//����
		shuffel(a);
		System.out.println(Arrays.toString(a));
	}

	private static int[] f1() {
		int[] a = new int[100];
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		return a;
	}

	private static void shuffel(int[] a) {
		/*
		 *            j           
		 * [1,2,3,4,5,6,7,8,9,10]
		 *  i
		 */
		//����
		for(int i=0;i<a.length;i++) {
			//�����λjλ��
			int j = new Random().nextInt(a.length);
			//i�����λ��j����
			swap(a, i, j);
		}
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}





