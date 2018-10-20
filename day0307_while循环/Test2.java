package day0307;

public class Test2 {
	public static void main(String[] args) {
		// >0.999
		
		int i = 0; //次数
		double d; //保存随机值
		
		do {
			d = Math.random();
			i++;
		} while(d <= 0.999);
		
		System.out.println("第"+i+"次："+d);
	}
}





