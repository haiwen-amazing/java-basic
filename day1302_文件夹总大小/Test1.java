package day1302;

import java.io.File;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�����ļ��У�");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("�����ļ���");
			return;
		}
		
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		//��dir�б�
		File[] files = dir.listFiles();
		if(files == null) {
			return 0;
		}
		
		//�ۼӱ���
		long sum = 0;
		
		//�����ļ��б�
		for (File f : files) {
			if(f.isFile()) {//f���ļ�
				sum += f.length();
			} else {//f���ļ���
				//�ݹ����ļ��д�С
				sum += dirLength(f);
			}
		}
		
		return sum;
	}
}








