package day0405;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 红球数组r
		 * [1,2,3,4,5,6..., 33]
		 * 
		 * 蓝球数组b
		 * [1,2,3..., 16]
		 */
		//调用方法，获得数组
		int[] r = f(33);
		int[] b = f(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		
		//从r数组，选出6个号码
		int[] red = selectRed(r);
		//从b数组，选出1个号码
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
		//i循环访问前6个位置
		for(int i=0; i<6; i++) {
			//i+[0, 33-i) ---> [i, 33)
			int j = i+new Random().nextInt(33-i);
			//交换数组r中i和j位置的值
			swap(r, i, j);
		}
		//从输入r截取前6个位置，生成一个新数组
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
		//新建int[]数组保存到变量a，长度是n
		int[] a = new int[n];
		//遍历
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
		}
		//返回数组a
		return a;
	}
	
}




