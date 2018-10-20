package day0804;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Transformer t = new Transformer();
		Sword s = new Sword();
		AK47 a = new AK47();
		Lyb l = new Lyb();
		Weapon w = new Weapon() {
			@Override
			public void kill() {
				System.out.println("捶你胸口~");      
			}
			@Override
			public String getName() {
				return "小拳拳";
			}
			@Override
			public int getType() {
				return Weapon.TYPE_HOT;
			}
		};
		
		System.out.println("按回车更换武器进攻");
		
		while(true) {
			//按回车
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(5);
			switch(r) {
			case 0: t.setWeapon(s); break;
			case 1: t.setWeapon(a); break;
			case 2: t.setWeapon(l); break;
			case 3: t.setWeapon(w); break;
			case 4: t.setWeapon(null); break;
			}
			t.attack();
		}
	}
}




