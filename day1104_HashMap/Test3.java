package day1104;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		Point a = new Point(1, 2);
		Point b = new Point(1, 2);
		
		//1.��ϣֵ������ͬ�����ܱ�֤�������ͬ�±�    
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//2.��ʹ��ϣֵ��ͬ��equal()Ҳ�������
		//���ܸ��ǣ�������������һ��
		System.out.println(a.equals(b));
		
		HashMap<Point, String> map = 
				new HashMap<>();
		map.put(a, "2��");
		map.put(b, "1.9��");
		System.out.println(map);
		
	}
}







