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
		//Ϊ�˼��ٴ����ظ�
		//������һ�����췽����д���Ĵ���
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
		 "ѧ�ţ�"+id+
		 ", ������ "+name+
		 ", �Ա�"+gender+
		 ", ���䣺"+age;
	}
}
