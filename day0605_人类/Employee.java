package day0605;

public class Employee extends Person {
	double salary;
	public String toString() {
		//return name+", "+gender+", "+age+", "+salary;
		return super.toString()+", "+salary;
	}
}
