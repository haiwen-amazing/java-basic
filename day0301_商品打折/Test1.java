package day0301;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����ԭ�ۣ�");
		//��������ֵ
		//�ٱ��浽����p
		double p = 
		 new Scanner(System.in).nextDouble();
		
		//p��ֵ�����ݵ�discount()�����������ۿۼ�
		p = discount(p);
		System.out.println("�ۿۼۣ�"+p);
	}
	
	static double discount(double p) {
		//�ۿ۱���
		double d = 1;
		//����ԭ��p��ֵ����ȷ���ۿ۱���
		if(p>=5000) {
			d = 0.75;
		} else if(p>=3000) {
			d = 0.8;
		} else if(p>=1000) {
			d = 0.85;
		} else if(p>=500) {
			d = 0.9;
		}
		return p*d;
	}
}







