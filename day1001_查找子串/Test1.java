package day1001;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�����ַ�����");
		String s = new Scanner(System.in).nextLine();
		System.out.println("������ҵ��Ӵ���");
		String t = new Scanner(System.in).nextLine();
		
		int[] a = find(s, t);
		System.out.println(Arrays.toString(a)); 
	}

	private static int[] find(String s, String t) {
		/*
		 * s  "aaaaaaaaaa"
		 *      |
		 *     
		 * t  "aaaa"
		 */
		//�½��㹻��������
		int[] a = new int[s.length()];
		//����a������±����
		int i = 0;
		
		//ÿ�β��ҵ���ʼλ�ã�
		//�ҵ����±�ֵ��Ҳ���浽�������
		int index = 0;
		
		//��ѭ�����ң�ֱ���Ҳ�������
		while(true) {
			//��s�д�indexλ�������ң�
			//�ҵ���λ�ñ��浽index
			index = s.indexOf(t, index);
			if(index == -1) {//�Ҳ���
				break;
			}
			//�ҵ����±꣬����a����
			a[i] = index;
			i++;
			//�´δ�index+1λ�ü��������
			index++;
		}
		//��ȡ�����ǰi��λ��
		a = Arrays.copyOf(a, i);
		return a;
	}
}





