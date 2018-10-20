package day0307;

public class Test1 {
	public static void main(String[] args) {
		// >0.999
		int i = 0; //次数
		double d = 0; //保存随机值
		
		while(d <= 0.999) {
			d = Math.random();
			i++;
		}
		
		System.out.println("第"+i+"次："+d);
	}
}
