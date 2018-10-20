package day1104;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入：");
		String s = new Scanner(System.in).nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		/*
		 * sdfasdsasf
		 *    i
		 *    
		 * a
		 * 
		 * 1. i循环遍历字符串s
		 *     2. 从s取出i位置字符存到变量c
		 *     3. 从map取出字符c对应的计数值
		 *        存到变量Integer count
		 *     4. 如果count==null
		 *          5. 在map中放入c和1
		 *     6. 否则
		 *          7. 在map中放入c和count+1
		 * 
		 * 8. 打印map
		 */
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			Integer count = map.get(c);
			if(count == null) {
				map.put(c, 1);
			} else {
				map.put(c, count+1);
			}
		}
		
		System.out.println(map);
	}
}






