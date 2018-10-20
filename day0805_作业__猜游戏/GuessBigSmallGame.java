package day0703;

import java.util.Random;

public class GuessBigSmallGame extends GuessGame {
	@Override
	public String suiJi() {
		//123456  7
		//1 + [0, 6)
		int r = 1 + new Random().nextInt();
		return String.valueOf(r);
	}
	@Override
	public void tiShi() {
		System.out.println("请猜大小");
	}
	@Override
	public String biJiao(String c, String r) {
		//c 大 小
		//r 123456
		int rr = Integer.parseInt(r);
		if(rr <= 3) {
			if(c.equals("小")) {
				return "对";
			}
		} else {
			if(c.equals("大")) {
				return "对";
			}
		}
		return "错";
	}
	@Override
	public boolean caiDui(String j) {
		return "对".equals(j);
	}
}
