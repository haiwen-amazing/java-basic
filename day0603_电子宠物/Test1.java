package day0603;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("������������֣�");
		String n = new Scanner(System.in).nextLine();
		
		//�½�Dog���󱣴浽����dog
		Dog dog = new Dog(n);
		
		//��dog���󴫵ݵ� play() ����
		play(dog);
	}

	private static void play(Dog dog) {
		while(true) {
			//���س�����
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






