package day1303;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		// FIS--"d:\\abc\\f1"
		FileInputStream in = 
		 new FileInputStream("d:/abc/f1");
		
		//���ֽڶ�ȡ��׼��ʽ
		int b;//ÿ�ζ�ȡ���ֽ�ֵ
		while((b = in.read()) != -1) {
			System.out.println(b);
		}
		
		in.close();
	}
}







