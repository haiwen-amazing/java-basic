package day0602;
/*
 * ���������ص����ݡ����㷽��
 * ��װ��Point��
 */
public class Point {
	//��Ա����
	int x;//Ĭ��ֵ 0
	int y;//Ĭ��ֵ 0	
	
	//���췽��
	public Point(int x, int y) {
		//��ͬ���ֲ�����
		//������this.xxx���ó�Ա����
		this.x = x;
		this.y = y;
	}
	
	//��Ա����	
	//���ԭ��ľ���
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}	
	//�����������ӳ��ַ���
	public String toString() {
		return "("+x+", "+y+")";
	}
}






