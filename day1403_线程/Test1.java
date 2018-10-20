package day1403;

public class Test1 {
	public static void main(String[] args) {
		//新建线程对象
		T1 t1 = new T1();
		T1 t2 = new T1();
		
		//启动两个线程
		//线程启动后，会执行 run() 方法中的代码
		t1.start();
		t2.start();
		
		System.out.println("main线程");
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			//获得线程名
			String n = getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+": "+i);  
			}
		}
	}
}











