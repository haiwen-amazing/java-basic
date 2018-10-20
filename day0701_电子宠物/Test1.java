package day0701;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("ѡ����");
		System.out.println("1. è");
		System.out.println("2. ��");
		System.out.println("3. ��");
		System.out.print("ѡ��");
		int c = new Scanner(System.in).nextInt();
		if(c != 1 && c != 2 && c != 3) {
			return;
		}
		
		System.out.print("��������֣�");
		String n = new Scanner(System.in).nextLine();
		
		//Dog dog;
		//Cat cat;
		Pet pet;
		
		if(c == 1) {
			pet = new Cat(n);
		} else if(c == 2){
			pet = new Dog(n);
		} else {
			pet = new Bird(n);
		}
		
		play(pet);
	}

	private static void play(Pet pet) {
		while(true) {
			//���س�����
			new Scanner(System.in).nextLine();
			double d = Math.random();//[0,1)
			if(d<0.333) {
				pet.feed();
			} else if(d<0.666) {
				pet.play();
			} else {
				pet.punish();
			}
		}
	}
}






