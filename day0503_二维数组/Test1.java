package day0503;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 1. �ر���Ŀ close project
		 * 2. ������Ŀ�б����عرյ���Ŀ
		 */
		
		char[][] a = {
				{'μ','��','��','��','��','��','��'},
				{'��','��','��','��','��','ɫ','��'},
				{'Ȱ','��','��','��','һ','��','��'},
				{'��','��','��','��','��','��','��'}				
		};
		/*
		 * ��Ȱ��μ
		 * �������
		 * �����೯
		 * ��...
		 */

		//i�±�����ڲ�����
		for(int i=0; i<a[0].length; i++) {
			//jѭ�����������Χ����
			for(int j=a.length-1; j>=0; j--) {
				System.out.print(a[j][i]);
			}			
			System.out.println();
		}
		
	}
}





