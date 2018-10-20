package day0605;

public class Student extends Person {
	String school;
	
	public String toString() {
		//return name+", "+gender+", "+age+", "+school;
		return super.toString()+", "+school;
	}
}
