package day0905;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		f(a);//显示数组的全排列
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
		 * *) 最简问题，start是末尾下标，
		 *    只对一个值排列，直接打印数组
		 * *) i从start向后递增
		 * *) i和start位置的值交换
		 *    把i位置的值，固定在start位置
		 * *) 递归对 start+1 后面的值全排列
		 * *) i和start位置，再交换回来，否则会出现混乱
		 */
		
		//最简问题
		if(start == a.length-1) {
			System.out.println(Arrays.toString(a));
			return;
		}
		for(int i=start; i<a.length; i++) {
			swap(a, start, i);
			f(a, start+1);//递归对start后面的值全排列
			swap(a, start, i);//要交换回来，否则会出现重复的排列
		}
	}
	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}







