package day0901;

public class Test2 {
	public static void main(String[] args) {
		Weapon w = f1();
		w.kill();
		System.out.println(w);
		
		System.out.println("-----------------");
		
		Weapon w2 = f2("方天画戟");
		w2.kill();
		System.out.println(w2);
	}

	private static Weapon f2(String name) {
		
		
		Weapon w = new Weapon() { 
			//编译器会在局部内部类中，
			//生成一个相同的变量
			//为了保持内外变量的值的一致
			//限制内外变量都不可修改，定义成常量
			//final String name;
			
			@Override
			public void kill() {
				/*
				 * 局部内部类中，
				 * 使用外面的一个局部变量，
				 * 必须加final
				 */
				System.out.println(
				 "使用"+name+"进攻");
			}
		};
		
		
		return w;
		
	}
	
	
	

	private static Weapon f1() {
		class AK47 implements Weapon {
			@Override
			public void kill() {
				System.out.println("使用AK47进攻");
			}
		}
		
		AK47 a = new AK47();
		return a;		
	}
}










