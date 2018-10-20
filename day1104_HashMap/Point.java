package day1104;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public int hashCode() {
		/*
		 * ���������ݣ��������ϣֵ
		 * 
		 * *) ������ͬ��Ҫ�������ͬ�Ĺ�ϣֵ
		 * *) ���Բ�ͬ��Ҫ�����������ͬ��ϣֵ
		 * 
		 * ��һ���㷨������ѧ�ҷ�����
		 * ��һ����Ч�ģ������㷨
		 */
		int p = 31;
		int r = 1;
		r = r*p + x;
		r = r*p + y;
		return r;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if(! (obj instanceof Point)) return false;
		
		Point p = (Point) obj;
		return x == p.x && y == p.y;
	}
	
}









