package day0203;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(1);
		//�õ�f()�����ķ���ֵ
		//���浽����r
		int r = f(2);
		System.out.println(r);
		System.out.println("-----------");
		
		System.out.println(f(3));
		System.out.println(f(4) + 4);
	}
	
	/*
	 * void���գ� ��ʾ����û�з���ֵ
	 * ����з���ֵ����Ҫ���巵��ֵ����������
	 * 
	 * f(x)���������ղ���x����xƽ��
	 */
	static int f(int x) {
		int r = x*x;
		return r;//�����λ�÷��ؽ�����
	}
	
}



