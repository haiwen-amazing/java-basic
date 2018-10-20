package day1501;

public class Test2 {
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
		 * r1.get(), r1.get(), r1.get(), r1.get()...
		 */
		while(true) {
			int i = r1.get();
			if(i%2 == 1) {
				System.out.println(i);
				System.exit(0);//退出虚拟机
			}
		}
		
		
	}
	
	static class R1 implements Runnable {
		static int i;
		public synchronized void add() {
			i++;
			i++;
		}
		public synchronized int get() {
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









