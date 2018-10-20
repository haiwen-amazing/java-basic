package day1003;

public class Test1 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		//系统时间毫秒值
		long t = System.currentTimeMillis();
		for(int i=0;i<100000000;i++) {
			sb.append(s0);
		}
		t = System.currentTimeMillis()-t;
		System.out.println(t);
	}
}
