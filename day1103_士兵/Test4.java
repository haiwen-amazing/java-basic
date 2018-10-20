package day0601;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.print("士兵数量：");
		int n = new Scanner(System.in).nextInt();
		ArrayList<Soldier> list = new ArrayList<>(n);
		//1到n个士兵
		for(int i=1; i<=n; i++) {
			Soldier s = new Soldier();
			s.id = i;//i的值作为士兵的id
			list.add(s);
		}
		System.out.println("士兵数量："+list.size());
		
		//当还有存活的士兵
		while(list.size() != 0) {
			//按回车
			new Scanner(System.in).nextLine();
			//n次，随机挑选n个士兵进攻
			for(int i=0;list.size()!=0 && i<n;i++) {
				//随机访问一个士兵
				int j = new Random().nextInt(list.size());
				Soldier s = list.get(j);
				s.attack();
				//士兵阵亡
				if(s.blood == 0) {
					list.remove(j);//从集合把士兵移除 
				}
			}
			System.out.println("士兵数量："+list.size());
			System.out.println("-------------------");
		}
		
	}
}








