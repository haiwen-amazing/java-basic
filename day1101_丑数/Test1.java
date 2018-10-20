package day1101;

import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("求第几个丑数：");
		int n = new Scanner(System.in).nextInt();
		
		long r = f(n);
		System.out.println(r);
	}

	private static long f(int n) {
		/*
		 * 4  6
		 * ----------------
		 * 6  9
		 * ----------------
		 * 5 10  15
		 * ----------------
		 * 
		 * r = 3
		 */
		LinkedList<Long> list2 = new LinkedList<>();
		LinkedList<Long> list3 = new LinkedList<>();
		LinkedList<Long> list5 = new LinkedList<>();
		
		list2.add(2L);
		list3.add(3L);
		list5.add(5L);
		
		//变量r保存每一次取出的丑数
		long r = 0;
		
		//从第1个，求到第n个
		for(int i=1;i<=n;i++) {
			long a = list2.getFirst();
			long b = list3.getFirst();
			long c = list5.getFirst();
			r = Math.min(a, Math.min(b, c));
			if(r==a) list2.removeFirst();
			if(r==b) list3.removeFirst();
			if(r==c) list5.removeFirst();
			//
			list2.add(r*2);
			list3.add(r*3);
			list5.add(r*5);
		}
		return r;
	}
}





