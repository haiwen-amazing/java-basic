package day1001;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入字符串：");
		String s = new Scanner(System.in).nextLine();
		System.out.println("输入查找的子串：");
		String t = new Scanner(System.in).nextLine();
		
		LinkedList<Integer> a = find(s, t);
		System.out.println(a); 
	}

	private static LinkedList<Integer> find(String s, String t) {
		/*
		 * s  "aaaaaaaaaa"
		 *      |
		 *     
		 * t  "aaaa"
		 */
		//新建足够长的数组
		//int[] a = new int[s.length()];
		//访问a数组的下标变量
		//int i = 0;
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//每次查找的起始位置，
		//找到的下标值，也保存到这个变量
		int index = 0;
		
		//死循环查找，直到找不到结束
		while(true) {
			//在s中从index位置向后查找，
			//找到的位置保存到index
			index = s.indexOf(t, index);
			if(index == -1) {//找不到
				break;
			}
			//找到的下标，放入a数组
			//a[i] = index;
			//i++;
			list.add(index);
			
			//下次从index+1位置继续向后找
			index++;
		}
		//截取数组的前i个位置
		return list;
	}
}





