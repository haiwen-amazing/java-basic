package day0703;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("1. ������");
		System.out.println("2. ����ĸ");
		System.out.print("ѡ��");
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







