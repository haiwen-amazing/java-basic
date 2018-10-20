package day1303;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		// FIS--"d:\\abc\\f1"
		FileInputStream in = 
		 new FileInputStream("d:/abc/f1");
		
		//单字节读取标准格式
		int b;//每次读取的字节值
		while((b = in.read()) != -1) {
			System.out.println(b);
		}
		
		in.close();
	}
}







