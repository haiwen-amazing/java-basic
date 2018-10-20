package day0701;

public abstract class Pet {

	String name;//默认值null
	int full;//默认值0
	int happy;//默认值0

	// 创建中等狗 
	public Pet(String name) {
		this.name = name;
		this.full = 50;
		this.happy = 50;
	}
	
	public Pet(String name,int full,int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	
	public void feed() {
		if(full == 100) {
			System.out.println(name+"已经吃不下了");
			return;
		}
		System.out.println("给"+name+"喂食");
		full += 10;
		System.out.println("饱食度："+full);
	}
	
	public void play() {
		if(full == 0) {
			System.out.println(name+"饿得玩不动了");
			return;
		}
		System.out.println("陪"+name+"玩耍");
		full -= 10;
		happy += 10;
		System.out.println(
		 "饱食度："+full+"，快乐度："+happy);
	}
	
	public void punish() {
		System.out.println(
			"打"+name+"的pp，"+name+"哭叫："+cry());
		happy -= 10;
		System.out.println("快乐度："+happy);   
	}
	
	// 抽象方法
	// 只有方法的定义，没有方法代码块
	public abstract String cry();
}







