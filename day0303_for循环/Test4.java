package day0303;

public class Test4 {
	public static void main(String[] args) {
		//��ӡ1��100������β��3,5,7
		for(int i=1; i<=100; i++) {
			//β����3,5,7������i++������������һ��ѭ��
			int y = i%10;
			if(y==3 || y==5 || y==7) {
				continue;//����i++
			}
			System.out.println(i);
		}
	}
}
