	package day0102;
	//������ָ��·��
	//������Լ�д������ʡ�԰���
	import java.util.Scanner;
	
	public class Test1 {
		public static void main(String[] args) {
			System.out.print("��������a: ");
			//�õ������ֵ
			//�ٱ��浽����a
			int a = new Scanner(System.in).nextInt();
			
			System.out.print("��������b: ");
			int b = new Scanner(System.in).nextInt();
			
			//����
			int c = a;
			a = b;
			b = c;
			
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
	}
	
	
	
	
	
	
	
