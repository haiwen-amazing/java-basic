package day1403;

public class Test2 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		//�½�R1����
		//��װ�߳���ִ�еĴ���
		R1 r1 = new R1();
		//��r1���󣬽����½����̶߳���
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		//���߳�����
		t1.setName("�߳�1");
		t2.setName("�߳�2");
		//�����߳�
		//������ִ�� r1.run()
		t1.start();
		t2.start();
	}
	
	static class R1 implements Runnable {
		@Override
		public void run() {
			//�������ִ�е��̶߳���
			Thread t = Thread.currentThread();
			//�߳���
			String n = t.getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+": "+i);  
			}
		}
	}
}







