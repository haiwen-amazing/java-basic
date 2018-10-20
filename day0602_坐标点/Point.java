package day0602;
/*
 * 把坐标点相关的数据、运算方法
 * 封装成Point类
 */
public class Point {
	//成员变量
	int x;//默认值 0
	int y;//默认值 0	
	
	//构造方法
	public Point(int x, int y) {
		//有同名局部变量
		//必须用this.xxx调用成员变量
		this.x = x;
		this.y = y;
	}
	
	//成员方法	
	//求距原点的距离
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}	
	//属性数据连接成字符串
	public String toString() {
		return "("+x+", "+y+")";
	}
}






