package day1301;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		/*
		 * File��װ��·���У����������б�ܶ�֧��
		 *   \\
		 *   /
		 */
		//path = "D:\\home\\java\\eclipse\\eclipse.exe";//���ڵ��ļ�·��
		//path = "D:\\home\\java\\eclipse";//���ڵ��ļ���·��
		path = "x:/xx/xx/xx";//�����ڵ�·��
		
		//�½�File���󣬷�װpath·��
		File f = new File(path);
System.out.println(f.exists());//�Ƿ����  
System.out.println(f.getAbsolutePath());//����·��
System.out.println(f.length());//�ֽ������ļ�����Ч
System.out.println(f.isFile());//�Ƿ����ļ�
System.out.println(f.isDirectory());//�Ƿ����ļ���
System.out.println(f.lastModified());//����޸�ʱ�����ֵ
	}
}




