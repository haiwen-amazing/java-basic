package day0603;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("给宠物起个名字：");
		String n = new Scanner(System.in).nextLine();
		
		//新建Dog对象保存到变量dog
		Dog dog = new Dog(n);
		
		//把dog对象传递到 play() 方法
		play(dog);
	}

	private static void play(Dog dog) {
		while(true) {
			//按回车继续
			new Scanner(System.in).nextLine();
			double d = Math.random();//[0,1)
			if(d<0.333) {
				 dog.feed();
			} else if(d<0.666) {
				dog.play();
			} else {
				dog.punish();
			}
		}
	}
}






