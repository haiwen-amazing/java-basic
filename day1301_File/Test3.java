package day1301;

import java.io.File;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws Exception {
		//在系统临时目录，创建临时文件
		//系统空间紧张时，文件可能会被自动清理
		//管家类软件，可能清理垃圾文件
		
		File f = 
		 File.createTempFile("abc", ".txt");
		
		System.out.println(f.getAbsolutePath());  
	}
}







