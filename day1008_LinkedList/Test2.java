package day1008;

import java.util.Iterator;
import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = 
			new LinkedList<>();
		for(int i=0;i<1000000;i++) {
			list.add(1);
		}
		
		long t = System.currentTimeMillis();
		f1(list);
		System.out.println(
		 System.currentTimeMillis()-t);
		
		t = System.currentTimeMillis();
		f2(list);
		System.out.println(
		 System.currentTimeMillis()-t);
	}

	private static void f1(LinkedList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			list.get(i);
		}
	}

	private static void f2(LinkedList<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			it.next();
		}
	}
}






