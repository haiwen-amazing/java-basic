package day0606;

public class Point3D extends Point {
	int z;
	
	//默认构造方法
	//public Point3D() {
	//	//隐含调用父类无参构造
	//	super();
	//}
	
	public Point3D(int x, int y, int z) {
		//隐含调用父类无参构造
		//super();
		super(x, y);
		this.z = z;
	}
	
	@Override
	public double distnace() {
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+", "+z+")";
	}
}



