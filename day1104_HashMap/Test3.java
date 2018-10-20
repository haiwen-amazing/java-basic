package day1104;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		Point a = new Point(1, 2);
		Point b = new Point(1, 2);
		
		//1.哈希值必须相同，才能保证计算出相同下标    
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//2.即使哈希值相同，equal()也必须相等
		//才能覆盖，否则链表连在一起
		System.out.println(a.equals(b));
		
		HashMap<Point, String> map = 
				new HashMap<>();
		map.put(a, "2亿");
		map.put(b, "1.9亿");
		System.out.println(map);
		
	}
}







