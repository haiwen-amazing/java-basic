package day1402;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * OSW--FOS--f4  GBK(ϵͳĬ��)
		 * OSW--FOS--f5  UTF-8
		 */
		OutputStreamWriter out;
		
		out = new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f4"));
		f(out);
		
		out = new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f5"), "UTF-8");
		f(out);
	}

	private static void f(OutputStreamWriter out) throws IOException {
		//20902������
		// Unicode�������ķ�Χ�� \u4e00 �� \u9fa5
		int i=0;
		for(char c='\u4e00';c<='\u9fa5';c++) {
			out.write(c);
			i++;
			if(i == 30) {//ÿ��30���ַ��ӻ���
				out.write('\n');
				i = 0;
			}
		}
		out.close();
	}
}







