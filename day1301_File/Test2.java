package day1301;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.�½� d:\abc �ļ���
		 * 2.��abc�ļ��У��½� f1 �ļ�
		 * 3.ɾ��f1�ļ�
		 * 4.ɾ��abcĿ¼
		 */
		System.out.println("���س�");
		new Scanner(System.in).nextLine();		
		File dir = new File("d:/abc");
		dir.mkdirs();		
		new Scanner(System.in).nextLine();		
		File f = new File("d:/abc/f1");
		f.createNewFile();
		new Scanner(System.in).nextLine();		
		f.delete();
		new Scanner(System.in).nextLine();		
		dir.delete();
		
	}
}




