package day1301;

import java.io.File;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws Exception {
		//��ϵͳ��ʱĿ¼��������ʱ�ļ�
		//ϵͳ�ռ����ʱ���ļ����ܻᱻ�Զ�����
		//�ܼ���������������������ļ�
		
		File f = 
		 File.createTempFile("abc", ".txt");
		
		System.out.println(f.getAbsolutePath());  
	}
}







