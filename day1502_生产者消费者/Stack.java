package day1502;

public class Stack {
	private char[] a = new char[5];
	private int i;
	
	public void push(char c) {
		if(i == 5) {
			return;
		}
		a[i] = c;
		i++;
	}
	
	public char pop() {
		if(i == 0) {
			return ' ';//�ÿո��ʾû������
		}
		i--;
		char c = a[i];
		return c;
	}
	
	public int size() {
		return i;
	}
}



