package day0605;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("����","��",22);
		Student s = new Student();
		Employee e = new Employee();		
		s.name = "����";
		s.gender = "Ů";
		s.age = 21;
		s.school = "����״�ѧ";		
		e.name = "����"; 
		e.gender = "��";
		e.age = 23;
		e.salary = 8000;
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
		f(p);
		f(s);//����ת��
		f(e);//����ת��
	}
	
	static void f(Person p) {
		System.out.println(
		 "���������� Person ������");
		/*
		 * p��Person, ִ��Person���toString()
		 * p��Student, ִ������Student��д��toString()
		 * p��Employee, ִ������Employee��д��toString()
		 */
		System.out.println(p.toString());
	}
	
}





