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
		System.out.println("��´�С");
	}
	@Override
	public String biJiao(String c, String r) {
		//c �� С
		//r 123456
		int rr = Integer.parseInt(r);
		if(rr <= 3) {
			if(c.equals("С")) {
				return "��";
			}
		} else {
			if(c.equals("��")) {
				return "��";
			}
		}
		return "��";
	}
	@Override
	public boolean caiDui(String j) {
		return "��".equals(j);
	}
}
