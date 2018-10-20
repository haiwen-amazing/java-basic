package day0606;

public class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distnace() {
		return Math.sqrt(x*x + y*y);
	}
	public String toString() {
		return "("+x+", "+y+")";
	}
}






