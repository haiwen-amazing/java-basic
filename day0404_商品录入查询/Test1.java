package day0404;

import java.util.Scanner;

public class Test1 {
	//��Ʒ��������
	static String[] names = {"iPhoneX","��ΪP20","С��8","vivo NEX","oppo Find X"};
	//�۸�����
	static double[] prices = {6890, 4799, 2999, 3899, 3199};
	//��Ʒ��������
	static int[] numbers = {80, 50, 100, 150, 90};
	
	
	public static void main(String[] args) {
		outer:
		while(true) {
			//��ʾ�˵������ѡ���ֵ
			int c = menu();
			switch(c) {
			case 1: f1(); break;
			case 2: f2(); break;
			case 3: f3(); break;
			case 4: f4(); break;
			case 5: break outer;
			default:
				System.out.println("ѡ�����");
			}
		}
	}

	private static int menu() {
		System.out.println("---------------------");
		System.out.println("1. ��Ʒ�б�");
		System.out.println("2. ��Ʒ¼��");
		System.out.println("3. ��Ʒ��ѯ");
		System.out.println("4. ͳ����Ϣ");
		System.out.println("5. �˳�");
		System.out.println("---------------------");
		System.out.print("ѡ��");
		int c = new Scanner(System.in).nextInt();
		return c;
	}

	private static void f1() {
		/*
		 * 1. ���ƣ�xx���۸�xx��������xx
		 * 2. ...
		 */
		//��������
		for(int i=0; i<names.length; i++) {
			System.out.println(
			 (i+1)+". ���ƣ�"+names[i]+
			 "���۸�"+prices[i]+
			 "��������"+numbers[i]);
		}
	}

	private static void f2() {
		//��������
		for(int i=0;i<names.length;i++) {
			System.out.println("¼���"+(i+1)+"����Ʒ");
			System.out.print("���ƣ�");
			String n = new Scanner(System.in).nextLine();
			System.out.print("�۸�");
			double p = new Scanner(System.in).nextDouble();
			System.out.print("������");
			int b = new Scanner(System.in).nextInt();
			names[i] = n;
			prices[i] = p;
			numbers[i] = b;
		}
		//������ʾ��Ʒ�б�
		f1();
	}

	private static void f3() {
		System.out.print("��ѯ����Ʒ���ƣ�");
		String n = new Scanner(System.in).nextLine();
		//��������
		for(int i=0; i<names.length; i++) {
			//iλ����Ʒ�����ѯ����Ʒ��n�Ƿ����
			//�ַ����Ƚ��Ƿ���ȣ�Ҫ��equals()����
			if(names[i].equals(n)) {
				System.out.println(
				 (i+1)+". ���ƣ�"+names[i]+
				 "���۸�"+prices[i]+
				 "��������"+numbers[i]);
				return;//�������˽���
			}
		}
		System.out.println("�Ҳ�����Ʒ");
	}

	private static void f4() {
		/*
		 * ��Ʒ�ܼ�
		 * ƽ������
		 * ��ߵ���
		 * ����ܼ�
		 */
		double spzj = 0;//��Ʒ�ܼ�
		double djzj = 0;//�����ܼ�
		double zgdj = 0;//��ߵ���
		double zgzj = 0;//����ܼ�
		//����
		for(int i=0; i<names.length; i++) {
			spzj += prices[i]*numbers[i];
			djzj += prices[i];
			if(prices[i] > zgdj) {
				zgdj = prices[i];
			}
			if(prices[i]*numbers[i] > zgzj) {
				zgzj = prices[i]*numbers[i];
			}
		}
		
		System.out.println("��Ʒ�ܼ�: "+spzj);
		System.out.println("ƽ������: "+(djzj/names.length));
		System.out.println("��ߵ���: "+zgdj);
		System.out.println("����ܼ�: "+zgzj);
		
	}
}






