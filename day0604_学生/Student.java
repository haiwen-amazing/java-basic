package day0604;

public class Student {
	int id;
	String name;
	String gender;
	int age;
	
	public Student() {
		
	}
	public Student(int id,String name) {
		this(id,name,null);
	}
	public Student(int id,String name,String gender) {
		//为了减少代码重复
		//调用另一个构造方法中写过的代码
		this(id,name,gender,0);
	}
	public Student(int id,String name,String gender,int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String toString() {
		return 
		 "学号："+id+
		 ", 姓名： "+name+
		 ", 性别："+gender+
		 ", 年龄："+age;
	}
}
