package day0502;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//�����������
		int[] a = suiJi();
		//������a����
		//Arrays.sort(a)�Ż��Ŀ��������㷽��
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.print("���ҵ�ֵ��");
		int t = new Scanner(System.in).nextInt();
		//���ַ�����
		//��a��������Ŀ��ֵt��λ��
		int index = binarySearch(a, t);
		System.out.println(t+"��λ���±꣺ "+index);
	}

	private static int[] suiJi() {
		/*
		 * 1.����5+[0,6)��������浽���� len
		 * 2.�½�len����int[]���� a
		 * 3.��������100���������
		 * 4.�������� a
		 */
		int len = 5+new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<len;i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}
	
	
	
	

	private static int binarySearch(
			int[] a, int t) {
		/*
		 * t = 60
		 *             mid
		 * [5, 16, 35, 60, 75, 78, 83, 93]
		 *  lo
		 *                             hi
		 * 1. ���������±����
		 *    lo=0
		 *    hi=a.length-1
		 *    mid;
		 * 2. �� lo<=hi
		 *      3. �����м�λ���±�浽mid
		 *      4. ���midλ��ֵ��tС
		 *         lo��λ��mid+1
		 *      5. �������midλ��ֵ��t��
		 *         hi��λ��mid-1
		 *      6. ���򣬷���mid�±�ֵ
		 * 
		 * 7. ����-1������ֵ����ʾ�Ҳ���
		 */
		int lo=0;
		int hi=a.length-1;
		int mid;
		
		while(lo <= hi) {
			mid = (lo+hi) / 2;
			if(a[mid] < t) {
				lo = mid+1;
			} else if(a[mid] > t) {
				hi = mid-1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}








