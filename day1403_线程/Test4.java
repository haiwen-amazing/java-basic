package day1403;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("单线程");
		f1();
		
		System.out.println("-----------");
		
		System.out.println("5个线程");
		f2();
	}
	
	private static void f2() {
		long t = System.currentTimeMillis();
		T1 t1 = new T1(0,2000000);
		T1 t2 = new T1(2000000,4000000);
		T1 t3 = new T1(4000000,6000000);
		T1 t4 = new T1(6000000,8000000);
		T1 t5 = new T1(8000000,10000000);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		//main暂停，等待5个线程全部结束
		try {
			t1.join();//main暂停
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
		}
		int r = t1.count+t2.count+t3.count+t4.count+t5.count;
		
		
		System.out.println(
		 System.currentTimeMillis()-t);
		System.out.println(r);
	}

	private static void f1() {
		long t = System.currentTimeMillis();
		T1 t1 = new T1(0, 10000000);
		t1.start();
		
		//main线程暂停，等待t1结束
		try {
			t1.join();
		} catch (InterruptedException e) {      
		}
		System.out.println(
		 System.currentTimeMillis()-t);
		//t1线程的执行结果
		System.out.println(t1.count);
	}
	
	
	
	
	
	
	

	static class T1 extends Thread {
		//[start, end)
		int start;
		int end;
		int count;//保存计数结果
		public T1(int start, int end) {
			if(start<3) {
				start = 3;
				count = 1;
			}
			this.start = start;
			this.end = end;
		}
		
		@Override
		public void run() {
			for(int i=start; i<end; i++) {
				if(isPreme(i)) {
					count++;
				}
			}
		}

		private boolean isPreme(int i) {          
			double max = 1+Math.sqrt(i);
			//2到max，找能把i整除的值
			for(int j=2; j<max; j++) {
				if(i%j == 0) {
					return false;
				}
			}
			return true;
		}
		
		
	}
	
}





