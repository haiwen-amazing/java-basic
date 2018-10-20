package day0802;

public class Test1 {
	public static void main(String[] args) {
		Student s = new Student();
		//s.id = 5;
		s.setId(5);
		s.setName("ÕÅÈı");
		s.setGender("ÄĞ");
		s.setAge(26);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getGender());
		System.out.println(s.getAge());
	}
}
