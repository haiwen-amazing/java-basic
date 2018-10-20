package day0403;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		//新建10个长度的int[]数组
		//再把它的内存地址保存到变量a
		int[] a = new int[10];
		
		//遍历数组，存入1,2,3,4...10
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
		}
		System.out.println(Arrays.toString(a));
		
		//求数组中所有数据的平均值
		double p = f1(a);
		System.out.println("平均值："+p);
		
		//交换a数组中 3,4位置的值
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
		 * 平均
		 * 
		 * 遍历数组，累加所有的值，
		 * 再除数组长度求平均值
		 */
		//定义累加变量
		double sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}



