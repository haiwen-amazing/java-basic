package day1104;

import java.util.HashMap;

public class Test4 {
	public static void main(String[] args) {
		Student a = new Student(9527,"ÌÆ²®»¢","ÄÐ",19);
		Student b = new Student(9527,"ÌÆ²®»¢","ÄÐ",19);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.equals(b));
		
		HashMap<Student, Integer> map = new HashMap<>();
		map.put(a, 96);
		map.put(b, 91);
		System.out.println(map);
		
	}
}
