package day0303;

public class Test4 {
	public static void main(String[] args) {
		//打印1到100，跳过尾数3,5,7
		for(int i=1; i<=100; i++) {
			//尾数是3,5,7，跳到i++，继续进入下一轮循环
			int y = i%10;
			if(y==3 || y==5 || y==7) {
				continue;//跳到i++
			}
			System.out.println(i);
		}
	}
}
