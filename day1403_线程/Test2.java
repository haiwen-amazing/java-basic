package day1403;

public class Test2 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		//新建R1对象
		//封装线程中执行的代码
		R1 r1 = new R1();
		//将r1对象，交给新建的线程对象
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		//给线程命名
		t1.setName("线程1");
		t2.setName("线程2");
		//启动线程
		//启动后，执行 r1.run()
		t1.start();
		t2.start();
	}
	
	static class R1 implements Runnable {
		@Override
		public void run() {
			//获得正在执行的线程对象
			Thread t = Thread.currentThread();
			//线程名
			String n = t.getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+": "+i);  
			}
		}
	}
}







