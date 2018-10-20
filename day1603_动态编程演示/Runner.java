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
			 * �����·���ĸ�ʽ������ȡ����·��    
			 * "/" ���ŵ��ļ��У�bin
			 * "/cfg.txt"
			 * "/day1603/cfg.txt"
			 */
			String path = 
			 Runner.class
			 .getResource("/cfg.txt")
			 .getPath();
			//URL�����ʽ�� abc��-->abc%e4%b8%ad      
			//URL�����ԭʼ�ַ�
			path = URLDecoder.decode(path, "UTF-8");			
			// BR--ISR--FIS--path
			BufferedReader in = 
			 new BufferedReader(
			 new InputStreamReader(
			 new FileInputStream(path), "GBK"));  
			
			System.out.println("�����ʼ������");
			p = new Scanner(System.in).nextLine();
			
			String line;
			while((line = in.readLine()) != null) {
				//����#��ͷ���У��Ϳ���
				line = line.trim();
				if(line.startsWith("#")||line.length()==0) {
					continue;
				}
				
				execute(line);
			}
			
			in.close();
			
		} catch (Exception e) {
			System.out.println("ִ��ʧ��");
			e.printStackTrace();
		}
	}

	private static void execute(String line) throws Exception {
		// "day1603.A  ;  a"
		String[] a = line.split(";");
		Class<?> c = Class.forName(a[0].trim());
		Object obj = c.newInstance();//�޲ι���
		Method m = 
		 c.getMethod(a[1].trim(), String.class);
		p = (String) m.invoke(obj, p);
	}
}



