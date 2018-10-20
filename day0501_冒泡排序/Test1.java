package day0501;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//随机的乱序数组
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------");
		
		sort(a);//排序
		
		System.out.println("-----------------------");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiJi() {
		/*
		 * 1.随机产生一个数组的长度值赋给变量  len
		 *   长度范围 5+[0, 6)
		 * 2.新建len长度的int[]数组赋给 a
		 * 3.遍历a数组，填入100内随机整数
		 * 4.返回数组 a
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
		 * 冒泡排序
		 * 
		 *                     j              
		 * [1, 5, 16, 81, 77, 36, 60, 63, 74] 
		 *            i  
		 * 
		 * 1.i循环遍历数组
		 *      2.j循环从a.length-1到 >i 递减
		 *           3.如果数组j-1位置值比j位置值大
		 *                4.j-1和j位置值交换
		 */
		for(int i=0; i<a.length; i++) {
			
			boolean flag = false;//没有交换
			
			//j循环，比较相邻的值，把较小值向前换
			//最终把最小值，推到i位置
			for(int j=a.length-1; j>i; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					flag = true;//交换了数据
				}
			}
			//j循环中没有执行过交换
			//数据位置都是正确的，排序完成
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









