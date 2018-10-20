package day0701;

public class Cat extends Pet{
	public Cat(String name) {
		super(name);
	}
	public Cat(String name,int full,int happy) {
		super(name,full,happy);
	}
	
	@Override
	public String cry() {
		return "ίχ~";
	}
}


