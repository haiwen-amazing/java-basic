package day0606;

public class Point3D extends Point {
	int z;
	
	//Ĭ�Ϲ��췽��
	//public Point3D() {
	//	//�������ø����޲ι���
	//	super();
	//}
	
	public Point3D(int x, int y, int z) {
		//�������ø����޲ι���
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



