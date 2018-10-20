package day1102;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = 
				new ArrayList<>();
		
		list.add(99);
		list.add(55);
		list.add(11);
		list.add(88);
		list.add(33);
		list.add(77);
		list.add(99);
		list.add(99);
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(list.remove(2));
		System.out.println(list);
		
		System.out.println(list.remove(Integer.valueOf(99)));         
		System.out.println(list);
		
		//下标遍历
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//迭代器遍历，自己写
		Iterator<Integer> it = list.iterator();    
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
	}
}








