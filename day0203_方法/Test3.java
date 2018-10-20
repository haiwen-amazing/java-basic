package day0203;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(1);
		//得到f()方法的返回值
		//保存到变量r
		int r = f(2);
		System.out.println(r);
		System.out.println("-----------");
		
		System.out.println(f(3));
		System.out.println(f(4) + 4);
	}
	
	/*
	 * void（空） 表示方法没有返回值
	 * 如果有返回值，需要定义返回值的数据类型
	 * 
	 * f(x)方法，接收参数x，求x平方
	 */
	static int f(int x) {
		int r = x*x;
		return r;//向调用位置返回结算结果
	}
	
}



