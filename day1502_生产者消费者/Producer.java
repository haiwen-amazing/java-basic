package day1502;

import java.util.Random;

public class Producer extends Thread {
	private Stack stack;
	public Producer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		while(true) {
			//���СдӢ����ĸ
			char c = 
			 (char) ('a'+new Random().nextInt(26));
			synchronized (stack) {
				//������ˣ��ȴ�
				while(stack.size() == 5) {
					//ִ����������߳�
					//��stack�����ϵȴ�
					try {
						stack.wait();
					} catch (InterruptedException e) {     
					}
				}
				stack.push(c);
				System.out.println("ѹ��<-- "+c);
				stack.notifyAll();
			}
		}
	}
}






