package day0703;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	@Override
	public String suiJi() {
		int r = 1+new Random().nextInt(1000);
		//把整数转成字符串
		//  845  -->  "845"
		return String.valueOf(r);
	}
	@Override
	public void tiShi() {
		System.out.println("已经产生[1,1001)范围的随机整数");
		System.out.println("请猜这个数是几");
	}
	@Override
	public String biJiao(String c, String r) {
		//字符串解析成整数
		// "783" --> 783
		int a = Integer.parseInt(c);
		int b = Integer.parseInt(r);
		if(a>b) {
			return "大";
		} else if(a<b) {
			return "小";
		} else {
			return "对";
		}
	}
	@Override
	public boolean caiDui(String j) {
		return "对".equals(j);
	}
}



