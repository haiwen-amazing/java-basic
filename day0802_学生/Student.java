package day0802;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;

	//�޲ι��졢ȫ�ι���
	public Student() {
		super();
	}

	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	//�ù����ķ�����
	//�����Ʊ����ĸ�ֵ���̣���ȡֵ����
	public void setAge(int age) {
		if(age<13 || age>60) {
			return;
		}
		this.age = age;
	}
	

	public int getAge() {
		if(age>25) {
			return 18;
		}
		return age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}








