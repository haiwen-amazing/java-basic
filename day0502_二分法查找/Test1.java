package day0502;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//随机乱序数组
		int[] a = suiJi();
		//对数组a排序
		//Arrays.sort(a)优化的快速排序算方法
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.print("查找的值：");
		int t = new Scanner(System.in).nextInt();
		//二分法查找
		//在a数组中找目标值t的位置
		int index = binarySearch(a, t);
		System.out.println(t+"的位置下标： "+index);
	}

	private static int[] suiJi() {
		/*
		 * 1.产生5+[0,6)随机整数存到变量 len
		 * 2.新建len长度int[]数组 a
		 * 3.遍历填入100内随机整数
		 * 4.返回数组 a
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
		 * 1. 定义三个下标变量
		 *    lo=0
		 *    hi=a.length-1
		 *    mid;
		 * 2. 当 lo<=hi
		 *      3. 计算中间位置下标存到mid
		 *      4. 如果mid位置值比t小
		 *         lo定位到mid+1
		 *      5. 否则如果mid位置值比t大
		 *         hi定位到mid-1
		 *      6. 否则，返回mid下标值
		 * 
		 * 7. 返回-1无意义值，表示找不到
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








