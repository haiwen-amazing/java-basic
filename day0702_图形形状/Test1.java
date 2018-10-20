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
				System.out.println("抽象类不能新建实例");
				continue;
			case 1: s = new Line(); break;  
			case 2: s = new Square(); break;  
			default: s = new Circle(); break;     
			}
			f(s);
		}
	}

	//所有图形类型，当做一致的父类型来处理
	private static void f(Shape s) {
		//按回车
		new Scanner(System.in).nextLine();
		s.draw();
		
		//对Line类型进行特殊处理
		//向下转型后处理
		if(s instanceof Line) {
			//向下转型
			Line l = (Line) s;
			l.length();
		}
		
		//按回车
		new Scanner(System.in).nextLine();
		s.clear();
	}
}





