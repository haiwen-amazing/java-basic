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
			//随机小写英文字母
			char c = 
			 (char) ('a'+new Random().nextInt(26));
			synchronized (stack) {
				//如果满了，等待
				while(stack.size() == 5) {
					//执行这句代码的线程
					//在stack对象上等待
					try {
						stack.wait();
					} catch (InterruptedException e) {     
					}
				}
				stack.push(c);
				System.out.println("压入<-- "+c);
				stack.notifyAll();
			}
		}
	}
}






