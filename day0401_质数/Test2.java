package day0401;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("��������n��n��������������");
		int n = new Scanner(System.in).nextInt();
		
		int r = f(n);
		System.out.println(r);
	}
	
	static int f(int n) {
		if(n<2) {
			return 0;
		}
		//�����������count
		//��1��ʼ����Ϊ��һ����������֪��
		int count = 1;
		
		//iѭ����3��n��Χ��Ѱ������
		outer:
		for(int i=3; i<=n; i++) {
			//�ж�i�Ƿ�������
			double max = 1+Math.sqrt(i);
			for(int j=2; j<max; j++) {
				if(i%j == 0) {
					//i��������������i++���ж���һ��iֵ
					continue outer;
				}
			}
			count++;//i������������ֵ����
		}
		
		return count;
	}
}






