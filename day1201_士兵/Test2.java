package day0601;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("需要多少个士兵：");
		int n = new Scanner(System.in).nextInt();
		
		Soldier[] a = new Soldier[n];
		//遍历数组，在每个位置放入新的士兵实例
		for(int i=0;i<a.length;i++) {
			a[i] = new Soldier();
			a[i].id = i+1;
		}
		
		System.out.println("士兵数量："+Soldier.count);
		System.out.println("花费了 "+(Soldier.PRICE*n)+" 金币");
		
		//当还有存活的士兵
		while(Soldier.count != 0) {
			//按回车
			new Scanner(System.in).nextLine();
			//遍历所有士兵，进攻
			for(int i=0;i<a.length;i++) {
				a[i].attack();
			}
			System.out.println("士兵数量："+Soldier.count);
			System.out.println("----------------");
		}
		
	}
}









