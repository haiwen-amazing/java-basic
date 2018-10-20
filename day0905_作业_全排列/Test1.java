package day0905;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		f(a);//��ʾ�����ȫ����
	}
	
	private static void f(int[] a) {
		f(a, 0);
	}

	private static void f(int[] a, int start) {
		/*
		 * start
		 * |
		 * 1 2 3
		 *     i
		 * 
		 * *) ������⣬start��ĩβ�±꣬
		 *    ֻ��һ��ֵ���У�ֱ�Ӵ�ӡ����
		 * *) i��start������
		 * *) i��startλ�õ�ֵ����
		 *    ��iλ�õ�ֵ���̶���startλ��
		 * *) �ݹ�� start+1 �����ֵȫ����
		 * *) i��startλ�ã��ٽ����������������ֻ���
		 */
		
		//�������
		if(start == a.length-1) {
			System.out.println(Arrays.toString(a));
			return;
		}
		for(int i=start; i<a.length; i++) {
			swap(a, start, i);
			f(a, start+1);//�ݹ��start�����ֵȫ����
			swap(a, start, i);//Ҫ�������������������ظ�������
		}
	}
	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}







