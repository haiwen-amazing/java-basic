package day0403;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		//新建5个长度的boolean[]数组
		//再把它的内存地址，保存到变量a
		boolean[] a = new boolean[5];
		
		//int[]数组，直接初始化数组数据
		int[] b = {3,5,7,8,87,4,3,3};
		
		//Arrays.toString(数组)
		//把数组中的值，连接成字符串
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));  
		
		//初始化新数组数据，并保存到存在的变量
		b = new int[]{6,3,7};
		System.out.println(Arrays.toString(b));  
		
	}
}




