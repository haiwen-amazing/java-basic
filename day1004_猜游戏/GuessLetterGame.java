package day0703;

import java.util.Random;

public class GuessLetterGame extends GuessGame{
	@Override
	public String suiJi() {
		StringBuilder sb =
		 new StringBuilder(
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		for(int i=0; i<5; i++) {
			int j = new Random().nextInt(26);
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		
		sb.delete(5, 26);
		System.out.println(sb);
		return sb.toString();
	}
	
	@Override
	public void tiShi() {
		System.out.println("已经产生了5个不重复大写字母");
		System.out.println("请猜这5个字母");
	}
	@Override
	public String biJiao(String c, String r) {
		/*
		 *              a=2, b=2
		 * r  "SPYXZ"
		 *     j           
		 * c  "USYXX"
		 *      i
		 */
		//计数变量
		int a = 0;
		int b = 0;
		//i循环变量c字符串
		for(int i=0; i<5; i++) {
			//j循环遍历r字符串
			for(int j=0; j<5; j++) {
				//两个字符相等
				if(c.charAt(i) == r.charAt(j)) {
					//位置相等、不相等
					if(i == j) {
						a++;
					} else {
						b++;
					}
					break;//结束j循环
				}
			}
		}
		return a+"A"+b+"B";
	}
	@Override
	public boolean caiDui(String j) {
		return "5A0B".equals(j);
	}
}








