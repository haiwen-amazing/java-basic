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
		
		//�����f()�������ݶ�ά�����ά�����
		if(Math.random()<0.5) {
			f(a);
		} else {
			f(b);//����ת��
		}
	}
	
	static void f(Point p) {
		System.out.println(
		 "���� Point ������������");
		System.out.println(p.distnace());
		System.out.println(p.toString());
	}
	
	
}



