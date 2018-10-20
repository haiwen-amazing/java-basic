package day0101;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 八个变量保存四种整数的
		 * 最小值和最大值
		 */
		byte a = -128;
		byte b = 127;
		//调用jdk类库中的 Short 类
		//中的常量  MIN_VALUE 来获得最小值
		short c = Short.MIN_VALUE;
		short d = Short.MAX_VALUE;
		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE;
		long g = Long.MIN_VALUE;
		long h = Long.MAX_VALUE;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}






