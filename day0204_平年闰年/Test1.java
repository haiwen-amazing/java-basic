package day0204;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��ţ�");
		int y = new Scanner(System.in).nextInt();
		//��y��ֵ�����ݵ�f()������������
		//�ٻ�ø÷����ķ���ֵ
		boolean b = f(y);
		//�������b��ֵ����
		if(b) {
			System.out.println("����");
		} else {
			System.out.println("ƽ��");
		}
	}
	
	/*
	 * �Խ��յĲ���y��ֵ�����жϣ�
	 * �ж����Ƿ�������
	 * 
	 * ���꣺ 
	 *     * �ܱ�4���������Ҳ��ܱ�100����
	 *     * �ܱ�400����
	 *     
	 *     2000 ����
	 *     1000 ƽ��
	 *     2016 ����
	 *     2018 ƽ��
	 */
	static boolean f(int y) {
		//���岼��ֵ������������
		boolean r = false;
		//���y�ܱ�4����
		/*if(y%4 == 0) {
			//�ܱ�4�����������
			//��һ���жϣ����ܱ�100����
			if(y%100 != 0) {
				r = true;//������
			}
		}
		//����ܱ�400����
		if(y%400 == 0) {
			r = true;//������
		}*/
		
		//�ܱ�4�������Ҳ��ܱ�100����
		//���ߣ��ܱ�400����
		if((y%4==0 && y%100!=0) || y%400==0) {
			r = true;//������
		}
		
		//���ر���r��ֵ
		return r;
	}
	
}







