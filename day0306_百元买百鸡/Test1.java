package day0306;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * g m x
		 * 
		 * 1.gѭ����0��20
		 *     2.��gֻ����ʣ��Ǯ���浽����money
		 *     3.money����������ĸ�������浽����max
		 *     4.mѭ����0��max
		 *          5.������mֻĸ����ʣ��Ǯȫ��С��    
		 *            �������浽����x
		 *          6.��� g+m+x==100 ֻ
		 *              7.��ӡ������
		 *          
		 */
		for(int g=0; g<=20; g++) {
			int money = 100 - g*5;
			int max = money/3;
			for(int m=0; m<=max; m++) {
				int x = (money-(m*3)) * 3;
				if(m+g+x == 100) {
					System.out.println(
					 g+", "+m+", "+x);
				}
			}
		}
		
	}
}
