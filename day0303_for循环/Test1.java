package day0303;

public class Test1 {
	public static void main(String[] args) {

		System.out.println("--��ӡ1��10-----------------------");
		f1();
		System.out.println("--��ӡ10��1-----------------------");
		f2();
		System.out.println("--��ӡ2,4,6,8,10-----------------------");
		f3();
		System.out.println(
				"--��ӡ8,88,888...888888888-----------------------");
		f4();//һ��8���Ÿ�8
	}

	static void f1() {
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}
	}
	static void f2() {
		for(int i=10; i>=1; i--){
			System.out.println(i);
		}
	}
	static void f3() {
		for(int i=2; i<=10; i+=2){
			System.out.println(i);
		}
	}
	static void f4() {
		for(long i=8; i<=888888888; i=i*10+8){
			System.out.println(i);
		}
	}

}



