package day0703;

import java.util.Scanner;

/*
 * ��װ������Ϸ��ͨ�ô���
 */
public abstract class GuessGame {
	public void start() {
		String r = suiJi();//����һ�����ֵ
		tiShi();//��ʾ��ʾ
		//��ѭ����
		while(true) {
			System.out.print("�£�");
			String c = new Scanner(System.in).nextLine();
			
			try {
				//�Ƚϲµ�ֵc�����ֵr
				String j = biJiao(c, r);
				System.out.println(j);
				//j�ǲ��ǲ¶ԵĽ��
				if(caiDui(j)) {
					break;
				}
			} catch (Exception e) {
				System.out.println("��������������");
				continue;
			}
			
		}		
	}

	public abstract String suiJi();
	public abstract void tiShi();
	public abstract String biJiao(String c, String r);
	public abstract boolean caiDui(String j);
}





