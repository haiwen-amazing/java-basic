package day0403;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		//�½�5�����ȵ�boolean[]����
		//�ٰ������ڴ��ַ�����浽����a
		boolean[] a = new boolean[5];
		
		//int[]���飬ֱ�ӳ�ʼ����������
		int[] b = {3,5,7,8,87,4,3,3};
		
		//Arrays.toString(����)
		//�������е�ֵ�����ӳ��ַ���
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));  
		
		//��ʼ�����������ݣ������浽���ڵı���
		b = new int[]{6,3,7};
		System.out.println(Arrays.toString(b));  
		
	}
}




