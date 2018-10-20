package day1307;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("ԭ�ļ��У�");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isDirectory()) {
			System.out.println("ԭ�ļ��д���");
			return;
		}
		
		System.out.println("Ŀ���ļ��У�");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.exists()) {
			System.out.println("Ŀ���ļ����Ѿ�����");
			return;
		}
		
		try {
			copy(from, to);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
	}

	private static void copy(
			File fromDir, File toDir) throws Exception{
		//��ԭ�ļ����б�
		File[] files = fromDir.listFiles();
		if(files == null) {
			throw new IOException("�޷�����ԭ�ļ���");
		}
		
		//����Ŀ���ļ���
		if(! toDir.mkdirs()) {
			throw new IOException("�޷������ļ���");
		}
		
		//�������ļ�����Ŀ¼
		for (File f : files) {
			if(f.isFile()) {
				copyFile(f, new File(toDir, f.getName()));
			} else {
				copy(f, new File(toDir, f.getName()));
			}
		}
	}

	private static void copyFile(
			File from, File to) throws Exception {
		FileInputStream in = new FileInputStream(from);
		FileOutputStream out = new FileOutputStream(to);
		byte[] buff = new byte[8192];
		int n;
		while((n = in.read(buff)) != -1) {
			out.write(buff, 0, n);
		}
		in.close();
		out.close();
	}
}








