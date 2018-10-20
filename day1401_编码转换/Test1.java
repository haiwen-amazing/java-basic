package day1401;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//�ڴ�����Unicode����
		//��Ӣ�Ķ���˫�ֽ�
		// a   00 61
		// ��    4e 2d
		String s = "abc���Ć��F";
		System.out.println(s);
		
		// Unicode --> ����
		f(s, null);
		f(s, "GBK");
		f(s, "GB2312");
		f(s, "UTF-8");
	}
	/*
	 * encoding		����
	 * charset		�ַ���
	 */
	private static void f(
			String s, String encoding) throws Exception {
		/*
		 * "a��"
		 * Unicode:
		 * 		00 61 4e 2d
		 * GBK:
		 * 		61 d6 d0
		 * UTF-8:
		 * 		61 e4 b8 ad
		 */
		byte[] a;
		if(encoding == null) {
			a = s.getBytes();//Ĭ�ϱ���
		} else {
			a = s.getBytes(encoding);
		}
		System.out.println(
		 encoding+"\t"+Arrays.toString(a));
	}
}












