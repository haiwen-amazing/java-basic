package day0602;

public class Test1 {
	public static void main(String[] args) {
		//�½�Point����
		//�ڴ��ַ���浽����a
		Point a = new Point(3, 4);
		//Ϊa�����x,y���ԣ���ֵ3��4
		//a.x = 3;
		//a.y = 4;
		
		//��ӡa��ԭ��ľ���
		System.out.println(a.distance());
		//��ӡa��toString()�Ľ��
		System.out.println(a.toString());
		
		//�ڶ��������b�� 2,8
		Point b = new Point(2, 8);
		//b.x = 2;
		//b.y = 8;
		System.out.println(b.distance());
		System.out.println(b.toString());
	}
}





