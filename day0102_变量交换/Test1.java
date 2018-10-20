	package day0102;
	//导包，指明路径
	//后面可以简写类名，省略包名
	import java.util.Scanner;
	
	public class Test1 {
		public static void main(String[] args) {
			System.out.print("输入整数a: ");
			//得到输入的值
			//再保存到变量a
			int a = new Scanner(System.in).nextInt();
			
			System.out.print("输入整数b: ");
			int b = new Scanner(System.in).nextInt();
			
			//交换
			int c = a;
			a = b;
			b = c;
			
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
	}
	
	
	
	
	
	
	
