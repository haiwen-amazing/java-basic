package day0703;

import java.util.Random;

public class GuessLetterGame extends GuessGame{
	@Override
	public String suiJi() {
		char[] a = 
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		//iѭ������ǰ5��λ��
		for(int i=0;i<a.length;i++) {
			//����λ���������ѡһ��jλ��
			int j = new Random().nextInt(a.length);
			swap(a, i, j);//�����jλ���ַ�����ǰ����iλ��
		}
		//��ȡa����ǰ5��λ�ã��������ַ���
		String s = new String(a, 0, 5);
		System.out.println(s);
		return s;
	}
	
	private void swap(char[] a, int i, int j) {
		char t = a[i];
		a[i] = a[j];
		a[j] = t;
	}


	@Override
	public void tiShi() {
		System.out.println("�Ѿ�������5�����ظ���д��ĸ");
		System.out.println("�����5����ĸ");
	}
	@Override
	public String biJiao(String c, String r) {
		/*
		 *              a=2, b=2
		 * r  "SPYXZ"
		 *     j           
		 * c  "USYXX"
		 *      i
		 */
		//��������
		int a = 0;
		int b = 0;
		//iѭ������c�ַ���
		for(int i=0; i<c.length(); i++) {
			//jѭ������r�ַ���
			for(int j=0; j<r.length(); j++) {
				//�����ַ����
				if(c.charAt(i) == r.charAt(j)) {
					//λ����ȡ������
					if(i == j) {
						a++;
					} else {
						b++;
					}
					break;//����jѭ��
				}
			}
		}
		return a+"A"+b+"B";
	}
	@Override
	public boolean caiDui(String j) {
		return "5A0B".equals(j);
	}
}








