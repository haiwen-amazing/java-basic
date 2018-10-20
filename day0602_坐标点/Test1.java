package day0602;

public class Test1 {
	public static void main(String[] args) {
		//新建Point对象
		//内存地址保存到变量a
		Point a = new Point(3, 4);
		//为a对象的x,y属性，赋值3和4
		//a.x = 3;
		//a.y = 4;
		
		//打印a距原点的距离
		System.out.println(a.distance());
		//打印a点toString()的结果
		System.out.println(a.toString());
		
		//第二个坐标点b， 2,8
		Point b = new Point(2, 8);
		//b.x = 2;
		//b.y = 8;
		System.out.println(b.distance());
		System.out.println(b.toString());
	}
}





