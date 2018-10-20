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
		 * 用属性数据，来计算哈希值
		 * 
		 * *) 属性相同，要计算出相同的哈希值
		 * *) 属性不同，要尽量计算出不同哈希值
		 * 
		 * 有一种算法，是数学家发明的
		 * 是一种有效的，惯用算法
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









