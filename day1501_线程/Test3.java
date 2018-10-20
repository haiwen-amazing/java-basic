package day1501;

public class Test3 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		/*
		 * 线程启动后，执行 r1.run()
		 * r1.add(), r1.add(), r1.add(), r1.add()...
		 */
		Thread t1 = new Thread(r1);
		t1.start();
		
		/*
		 * main线程
		 * r2.get(), r2.get(), r2.get(), r2.get()...
		 */
		R1 r2 = new R1();
		while(true) {
			int i = r2.get();
			if(i%2 == 1) {
				System.out.println(i);
				System.exit(0);//退出虚拟机
			}
		}
		
		
	}
	
	static class R1 implements Runnable {
		static int i;
		public static synchronized void add() {
			i++;
			i++;
		}
		public static synchronized int get() {
			return i;
		}
		@Override
		public void run() {
			while(true) {
				add();
			}
		}
	}
}









