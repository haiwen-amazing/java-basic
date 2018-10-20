package day0703;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("1. ²ÂÊý×Ö");
		System.out.println("2. ²Â×ÖÄ¸");
		System.out.println("3. ²Â´óÐ¡");
		System.out.print("Ñ¡Ôñ£º");
		int c = new Scanner(System.in).nextInt();
		if(c != 1 && c != 2 && c != 3) {
			return;
		}
		
		GuessGame game;
		if(c == 1) {
			game = new GuessNumberGame();
		} else if(c == 2) {
			game = new GuessLetterGame();
		} else {
			game = new GuessBigSmallGame();
		}
		
		game.start();
	}
}







