package day0703;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	@Override
	public String suiJi() {
		int r = 1+new Random().nextInt(1000);
		//������ת���ַ���
		//  845  -->  "845"
		return String.valueOf(r);
	}
	@Override
	public void tiShi() {
		System.out.println("�Ѿ�����[1,1001)��Χ���������");
		System.out.println("���������Ǽ�");
	}
	@Override
	public String biJiao(String c, String r) {
		//�ַ�������������
		// "783" --> 783
		int a = Integer.parseInt(c);
		int b = Integer.parseInt(r);
		if(a>b) {
			return "��";
		} else if(a<b) {
			return "С";
		} else {
			return "��";
		}
	}
	@Override
	public boolean caiDui(String j) {
		return "��".equals(j);
	}
}



