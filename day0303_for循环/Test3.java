package day0303;

public class Test3 {
	public static void main(String[] args) {
		//[0, 1)
		//double d = Math.random();
		//System.out.println(d);
		
		//>0.999
		//��ѭ��������ʡ�ԣ�������ִ��
		for(int i=1; ; i++) {
			double d = Math.random();
			if(d>0.999) {
				System.out.println(i+"�Σ�"+d);    
				break;
			}
		}
	}
}





