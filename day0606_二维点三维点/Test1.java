package day0606;

public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(3,4);
		System.out.println(a.distnace());
		System.out.println(a.toString());
		System.out.println("---------------");
		
		Point3D b = new Point3D(3,4,5);
		System.out.println(b.distnace());
		System.out.println(b.toString());
		
		//随机向f()方法传递二维点或三维点对象
		if(Math.random()<0.5) {
			f(a);
		} else {
			f(b);//向上转型
		}
	}
	
	static void f(Point p) {
		System.out.println(
		 "当做 Point 父类型来处理");
		System.out.println(p.distnace());
		System.out.println(p.toString());
	}
	
	
}



