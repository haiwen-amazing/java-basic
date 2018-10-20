package day1501;

public class Test1 {
	public static void main(String[] args) {
		char[] a = {'*','*','*','*','*'};
		T1 t1 = new T1(a);
		T2 t2 = new T2(a);
		t1.start();
		t2.start();
	}
	
	static class T1 extends Thread {
		private char[] a;
		private char c = '-';
		public T1(char[] a) {
			this.a = a;
		}
		@Override
		public void run() {
			while(true) {
				synchronized (a) {
					for (int i = 0; i < a.length; i++) {
						a[i] = c;
					}
				}
				c = c=='-'? '*' : '-';
			}
		}
	}
	
	static class T2 extends Thread {
		private char[] a;
		public T2(char[] a) {
			this.a = a;
		}
		@Override
		public void run() {
			while(true) {
				synchronized (a) {
					for (char c : a) {
						System.out.print(c);
					}
				}
				System.out.println();
			}
		}
	}
	
	
}







