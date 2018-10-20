package day0804;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Transformer t = new Transformer();
		Sword s = new Sword();
		AK47 a = new AK47();
		Lyb l = new Lyb();
		
		System.out.println("按回车更换武器进攻");
		
		while(true) {
			//按回车
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(4);
			switch(r) {
			case 0: t.setWeapon(s); break;
			case 1: t.setWeapon(a); break;
			case 2: t.setWeapon(l); break;
			case 3: t.setWeapon(null); break;
			}
			t.attack();
		}
	}
}




