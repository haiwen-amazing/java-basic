package day0205;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����������");
		//��������ֵ
		//�ٱ��浽����n
		int n = new Scanner(System.in).nextInt();
		
		//�����ƶ�24,16,8,0λ����ǿת��byte
		//���浽����b1,b2,b3,b4
		byte b1 = (byte) (n >> 24);
		byte b2 = (byte) (n >> 16);
		byte b3 = (byte) (n >> 8);
		byte b4 = (byte) (n >> 0);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		int r = 0;
		
		//�ĸ��ֽ�ֵ
		//������24λ(���ǰ����1����1����ȥ)��
		//�ٲ�����������0,8,16,24λ
		//����r��λ�򣬽�����浽r		
		r = r | (b1<<24>>>0);
		r = r | (b2<<24>>>8);
		r = r | (b3<<24>>>16);
		r = r | (b4<<24>>>24);
		
		System.out.println(r);
		
		r = 0;
		//�ĸ��ֽ�ֵ���� 0x000000ff ��λ��
		//������24,16,8,0λ
		//�ٺ�r��λ�򣬽���浽r
		r = r | ((b1 & 0x000000ff) << 24);
		r = r | ((b2 & 0x000000ff) << 16);
		r = r | ((b3 & 0x000000ff) << 8);
		r = r | ((b4 & 0x000000ff) << 0);
		System.out.println(r);
	}
}








