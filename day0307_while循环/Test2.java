package day0307;

public class Test2 {
	public static void main(String[] args) {
		// >0.999
		
		int i = 0; //����
		double d; //�������ֵ
		
		do {
			d = Math.random();
			i++;
		} while(d <= 0.999);
		
		System.out.println("��"+i+"�Σ�"+d);
	}
}





