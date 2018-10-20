package day0703;

import java.util.Random;

public class GuessLetterGame extends GuessGame{
	@Override
	public String suiJi() {
		StringBuilder sb =
		 new StringBuilder(
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		for(int i=0; i<5; i++) {
			int j = new Random().nextInt(26);
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		
		sb.delete(5, 26);
		System.out.println(sb);
		return sb.toString();
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
		for(int i=0; i<5; i++) {
			//jѭ������r�ַ���
			for(int j=0; j<5; j++) {
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








