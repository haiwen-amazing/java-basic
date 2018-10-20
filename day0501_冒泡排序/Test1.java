package day0501;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//�������������
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------");
		
		sort(a);//����
		
		System.out.println("-----------------------");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiJi() {
		/*
		 * 1.�������һ������ĳ���ֵ��������  len
		 *   ���ȷ�Χ 5+[0, 6)
		 * 2.�½�len���ȵ�int[]���鸳�� a
		 * 3.����a���飬����100���������
		 * 4.�������� a
		 */
		int len = 5 + new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

	private static void sort(int[] a) {
		/* 
		 * ð������
		 * 
		 *                     j              
		 * [1, 5, 16, 81, 77, 36, 60, 63, 74] 
		 *            i  
		 * 
		 * 1.iѭ����������
		 *      2.jѭ����a.length-1�� >i �ݼ�
		 *           3.�������j-1λ��ֵ��jλ��ֵ��
		 *                4.j-1��jλ��ֵ����
		 */
		for(int i=0; i<a.length; i++) {
			
			boolean flag = false;//û�н���
			
			//jѭ�����Ƚ����ڵ�ֵ���ѽ�Сֵ��ǰ��
			//���հ���Сֵ���Ƶ�iλ��
			for(int j=a.length-1; j>i; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					flag = true;//����������
				}
			}
			//jѭ����û��ִ�й�����
			//����λ�ö�����ȷ�ģ��������
			if(! flag) {
				break;
			}
			System.out.println(Arrays.toString(a));
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}









