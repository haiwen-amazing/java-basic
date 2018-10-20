package day1301;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		/*
		 * File封装的路径中，两个方向的斜杠都支持
		 *   \\
		 *   /
		 */
		//path = "D:\\home\\java\\eclipse\\eclipse.exe";//存在的文件路径
		//path = "D:\\home\\java\\eclipse";//存在的文件夹路径
		path = "x:/xx/xx/xx";//不存在的路径
		
		//新建File对象，封装path路径
		File f = new File(path);
System.out.println(f.exists());//是否存在  
System.out.println(f.getAbsolutePath());//完整路径
System.out.println(f.length());//字节量，文件夹无效
System.out.println(f.isFile());//是否是文件
System.out.println(f.isDirectory());//是否是文件夹
System.out.println(f.lastModified());//最后修改时间毫秒值
	}
}




