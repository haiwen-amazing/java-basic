package day1306;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Student s =
		 new Student(9527,"�Ʋ���","��",19);
		
		// OOS--FOS--f3
		ObjectOutputStream out = 
		 new ObjectOutputStream(
	     new FileOutputStream("d:/abc/f3"));
		
		out.writeObject(s);
		
		out.close();
		
	}
}



