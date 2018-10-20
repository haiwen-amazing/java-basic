package day1303;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		// FOS--"d:/abc/f1"
		
		//不管文件是否存在，都新建空文件
		//如果文件夹不存在，会出现异常
		FileOutputStream out = 
		 new FileOutputStream("d:/abc/f1");
		
		out.write(97);//00 00 00 61 --> 61
		out.write(98);//00 00 00 62 --> 62
		out.write(99);//00 00 00 63 --> 63
		out.write(356);//00 00 01 64--> 64
		
		byte[] a = {
				101,102,103,104,105,
				106,107,108,109,110
		};
		//输出数组中全部10个字节
		out.write(a);
		//输出数组中从3位置开始的4个字节
		out.write(a, 3, 4);
		
		
		out.close();//释放系统资源
		
	}
}








