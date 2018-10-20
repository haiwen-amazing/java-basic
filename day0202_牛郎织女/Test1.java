package day0202;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("两颗星相距16.4光年");
		System.out.println("光速 299792458米/秒");
		System.out.println("喜鹊身长 0.46 米");
		System.out.println("牛郎织女相会需要多少只喜鹊");
		
		//1光年是多少米
		long ly = 299792458L*60*60*24*365;		
		//16.4光年是多少米
		double d = 16.4 * ly;		
		//喜鹊数量
		double r = d/0.46;		
		//Math.ceil(r) 向上取整 
		//取整结果，是double类型 632525.0
		//可以强转成 long 类型
		long n = (long) Math.ceil(r);
		
		System.out.println(n);
	}
}






