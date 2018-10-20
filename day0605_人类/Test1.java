package day0605;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("张三","男",22);
		Student s = new Student();
		Employee e = new Employee();		
		s.name = "李四";
		s.gender = "女";
		s.age = 21;
		s.school = "家里蹲大学";		
		e.name = "王五"; 
		e.gender = "男";
		e.age = 23;
		e.salary = 8000;
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
		f(p);
		f(s);//向上转型
		f(e);//向上转型
	}
	
	static void f(Person p) {
		System.out.println(
		 "当做父类型 Person 来处理");
		/*
		 * p是Person, 执行Person类的toString()
		 * p是Student, 执行子类Student重写的toString()
		 * p是Employee, 执行子类Employee重写的toString()
		 */
		System.out.println(p.toString());
	}
	
}





