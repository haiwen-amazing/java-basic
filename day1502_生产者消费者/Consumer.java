package day1502;

public class Consumer extends Thread{
	private Stack stack;
	public Consumer(Stack stack) {
		this.stack = stack;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (stack) {
				//�գ��ȴ�
				while(stack.size() == 0) {
					try {
						stack.wait();
					} catch (InterruptedException e) {      
					}
				}
				char c = stack.pop();
				System.out.println("����--> "+c);
				stack.notifyAll();
			}
		}
	}
}
