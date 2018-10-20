package day0701;

public class Bird extends Pet{
	public Bird(String name) {
		super(name);
	}
	public Bird(String name,int full,int happy) {
		super(name,full,happy);
	}
	
	@Override
	public String cry() {
		return "à±à±~";
	}
}
