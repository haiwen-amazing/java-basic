package day1301;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("�����ļ��У�");
		String path = new Scanner(System.in).nextLine();
		
		File dir = new File(path);
		/*
		 * �ļ��в����ڣ�û��Ȩ�޽����ļ���
		 * ��õ�nullֵ
		 */
		String[] names = dir.list();
		File[] files = dir.listFiles();
		
		//for-each��ʽ�﷨
		//�����±�����﷨��ʽ�����˼�
		//���ʾ����±����		
		for(String s : names) {
			System.out.println(s);
		}
		
		for(File f : files) {
			System.out.println(
			 f.getName()+" - "+f.length());
		}
		
		
	}
}








