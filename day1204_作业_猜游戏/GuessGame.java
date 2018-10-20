package day0703;

import java.util.Scanner;

/*
 * 封装两种游戏的通用代码
 */
public abstract class GuessGame {
	public void start() {
		String r = suiJi();//产生一个随机值
		tiShi();//显示提示
		//死循环猜
		while(true) {
			System.out.print("猜：");
			String c = new Scanner(System.in).nextLine();
			
			try {
				//比较猜的值c和随机值r
				String j = biJiao(c, r);
				System.out.println(j);
				//j是不是猜对的结果
				if(caiDui(j)) {
					break;
				}
			} catch (Exception e) {
				System.out.println("输入有误，请重试");
				continue;
			}
			
		}		
	}

	public abstract String suiJi();
	public abstract void tiShi();
	public abstract String biJiao(String c, String r);
	public abstract boolean caiDui(String j);
}





