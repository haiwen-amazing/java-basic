package day0303;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		outer:
		for(int i=1; ; i++) {
			//显示菜单，并获得选择的值
			int c = menu(i);
			switch(c) {
			case 1:
				System.out.println("选择了选项一");
				break;
			case 2:
				System.out.println("选择了选项二");
				break;
			case 3:
				System.out.println("选择了选项三");
				break;
			case 4:
				System.out.println("Bye-bye");
				break outer;//跳出外层循环
			default:
				System.out.println("选择错误");
			}
		}
	}
	
	static int menu(int i) {
		System.out.println("--------------");
		System.out.println("1. 选项1");
		System.out.println("2. 选项2");
		System.out.println("3. 选项3");
		System.out.println("4. 退出");
		System.out.println("--------------");
		System.out.print("第"+i+"次选择：");
		int c = new Scanner(System.in).nextInt();
		return c;
	}
	
	
}




