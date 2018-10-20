package day1603;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.Scanner;

public class Runner {
	static String p;
	
	public static void launch() {
		try {
			/*
			 * 用相对路径的格式，来获取完整路径    
			 * "/" 类存放的文件夹，bin
			 * "/cfg.txt"
			 * "/day1603/cfg.txt"
			 */
			String path = 
			 Runner.class
			 .getResource("/cfg.txt")
			 .getPath();
			//URL编码格式： abc中-->abc%e4%b8%ad      
			//URL解码回原始字符
			path = URLDecoder.decode(path, "UTF-8");			
			// BR--ISR--FIS--path
			BufferedReader in = 
			 new BufferedReader(
			 new InputStreamReader(
			 new FileInputStream(path), "GBK"));  
			
			System.out.println("输入初始参数：");
			p = new Scanner(System.in).nextLine();
			
			String line;
			while((line = in.readLine()) != null) {
				//忽略#开头的行，和空行
				line = line.trim();
				if(line.startsWith("#")||line.length()==0) {
					continue;
				}
				
				execute(line);
			}
			
			in.close();
			
		} catch (Exception e) {
			System.out.println("执行失败");
			e.printStackTrace();
		}
	}

	private static void execute(String line) throws Exception {
		// "day1603.A  ;  a"
		String[] a = line.split(";");
		Class<?> c = Class.forName(a[0].trim());
		Object obj = c.newInstance();//无参构造
		Method m = 
		 c.getMethod(a[1].trim(), String.class);
		p = (String) m.invoke(obj, p);
	}
}



