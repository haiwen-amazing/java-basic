package day0601;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("��Ҫ���ٸ�ʿ����");
		int n = new Scanner(System.in).nextInt();
		
		Soldier[] a = new Soldier[n];
		//�������飬��ÿ��λ�÷����µ�ʿ��ʵ��
		for(int i=0;i<a.length;i++) {
			a[i] = new Soldier();
			a[i].id = i+1;
		}
		
		System.out.println("ʿ��������"+Soldier.count);
		System.out.println("������ "+(Soldier.PRICE*n)+" ���");
		
		//�����д���ʿ��
		while(Soldier.count != 0) {
			//���س�
			new Scanner(System.in).nextLine();
			//��������ʿ��������
			for(int i=0;i<a.length;i++) {
				a[i].attack();
			}
			System.out.println("ʿ��������"+Soldier.count);
			System.out.println("----------------");
		}
		
	}
}









