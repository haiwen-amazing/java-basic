package day0803;

public class Test1 {
	public static void main(String[] args) {
		new B();
		System.out.println("------------------");
		new B();
	}
}

class A {
	int v1 = 1;
	static int v2 = 2;
	static {
		System.out.println("A��̬��");
	}
	public A() {
		System.out.println("A����");
	}
}

class B extends A {
	int v3 = 3;
	static int v4 = 4;
	static {
		System.out.println("B��̬��");
	}
	public B() {
		System.out.println("B����");
	}
}

