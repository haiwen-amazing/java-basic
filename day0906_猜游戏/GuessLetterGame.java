package day0703;

import java.util.Random;

public class GuessLetterGame extends GuessGame{
	@Override
	public String suiJi() {
		char[] a = 
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		//i循环访问前5个位置
		for(int i=0;i<a.length;i++) {
			//所有位置中随机挑选一个j位置
			int j = new Random().nextInt(a.length);
			swap(a, i, j);//随机的j位置字符，向前换到i位置
		}
		//截取a数组前5个位置，创建成字符串
		String s = new String(a, 0, 5);
		System.out.println(s);
		return s;
	}
	
	private void swap(char[] a, int i, int j) {
		char t = a[i];
		a[i] = a[j];
		a[j] = t;
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
		for(int i=0; i<c.length(); i++) {
			//j循环遍历r字符串
			for(int j=0; j<r.length(); j++) {
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








