package day0703;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("1. ²ÂÊý×Ö");
		System.out.println("2. ²Â×ÖÄ¸");
		System.out.print("Ñ¡Ôñ£º");
		int c = new Scanner(System.in).nextInt();
		if(c != 1 && c != 2) {
			return;
		}
		
		GuessGame game;
		if(c == 1) {
			game = new GuessNumberGame();
		} else {
			game = new GuessLetterGame();
		}
		
		game.start();
	}
}







