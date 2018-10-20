package day1401;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//内存中是Unicode编码
		//中英文都是双字节
		// a   00 61
		// 中    4e 2d
		String s = "abc中文喆镕";
		System.out.println(s);
		
		// Unicode --> 其他
		f(s, null);
		f(s, "GBK");
		f(s, "GB2312");
		f(s, "UTF-8");
	}
	/*
	 * encoding		编码
	 * charset		字符集
	 */
	private static void f(
			String s, String encoding) throws Exception {
		/*
		 * "a中"
		 * Unicode:
		 * 		00 61 4e 2d
		 * GBK:
		 * 		61 d6 d0
		 * UTF-8:
		 * 		61 e4 b8 ad
		 */
		byte[] a;
		if(encoding == null) {
			a = s.getBytes();//默认编码
		} else {
			a = s.getBytes(encoding);
		}
		System.out.println(
		 encoding+"\t"+Arrays.toString(a));
	}
}












