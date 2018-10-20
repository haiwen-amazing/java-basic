package day0306;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * g m x
		 * 
		 * 1.g循环从0到20
		 *     2.买g只公鸡剩的钱，存到变量money
		 *     3.money最多能买多少母鸡，保存到变量max
		 *     4.m循环从0到max
		 *          5.又买了m只母鸡后，剩的钱全买小鸡    
		 *            数量保存到变量x
		 *          6.如果 g+m+x==100 只
		 *              7.打印这个组合
		 *          
		 */
		for(int g=0; g<=20; g++) {
			int money = 100 - g*5;
			int max = money/3;
			for(int m=0; m<=max; m++) {
				int x = (money-(m*3)) * 3;
				if(m+g+x == 100) {
					System.out.println(
					 g+", "+m+", "+x);
				}
			}
		}
		
	}
}
