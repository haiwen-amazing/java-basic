package day0904;

public class Test1 {
	public static void main(String[] args) {
		char[] a = {'a','b','c'};
		//���ڴ��·����ڴ�
		String s1 = new String(a);
		//�������·����ڴ�
		String s2 = "abc";
		//���ʳ����ش��ڵĶ���
		String s3 = "abc";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));

	}
}


