package day0303;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		outer:
		for(int i=1; ; i++) {
			//��ʾ�˵��������ѡ���ֵ
			int c = menu(i);
			switch(c) {
			case 1:
				System.out.println("ѡ����ѡ��һ");
				break;
			case 2:
				System.out.println("ѡ����ѡ���");
				break;
			case 3:
				System.out.println("ѡ����ѡ����");
				break;
			case 4:
				System.out.println("Bye-bye");
				break outer;//�������ѭ��
			default:
				System.out.println("ѡ�����");
			}
		}
	}
	
	static int menu(int i) {
		System.out.println("--------------");
		System.out.println("1. ѡ��1");
		System.out.println("2. ѡ��2");
		System.out.println("3. ѡ��3");
		System.out.println("4. �˳�");
		System.out.println("--------------");
		System.out.print("��"+i+"��ѡ��");
		int c = new Scanner(System.in).nextInt();
		return c;
	}
	
	
}




