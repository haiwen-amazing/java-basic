package day0702;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Shape s;
		while(true) {
			int r = new Random().nextInt(4);
			switch(r) {
			case 0: 
				//s = new Shape(); 
				//break;
				System.out.println("�����಻���½�ʵ��");
				continue;
			case 1: s = new Line(); break;  
			case 2: s = new Square(); break;  
			default: s = new Circle(); break;     
			}
			f(s);
		}
	}

	//����ͼ�����ͣ�����һ�µĸ�����������
	private static void f(Shape s) {
		//���س�
		new Scanner(System.in).nextLine();
		s.draw();
		
		//��Line���ͽ������⴦��
		//����ת�ͺ���
		if(s instanceof Line) {
			//����ת��
			Line l = (Line) s;
			l.length();
		}
		
		//���س�
		new Scanner(System.in).nextLine();
		s.clear();
	}
}





