package day0601;

import java.util.Random;

/*
 * ��װ��
 *     ��ʿ����ص����ݡ����㷽����
 *     ��װ��һ�����ࡱ���
 *     
 *     ��ʿ������������
 *     
 *     ģ�塢ͼֽ
 */
public class Soldier {
	//���Ա�������Ա����
	int id;//Ĭ��0
	int blood = 100;
	
	//��̬��ʿ����������
	//�ڷ�������Soldier���ڴ�ռ��У�
	//ֻ����һ��
	//������ʵ�����ڴ�ռ��б�����
	static int count; 
	//��̬��ʿ���۸����
	static final int PRICE = 6;
	
	//���췽��
	public Soldier() {
		System.out.println("ִ���˹��췽��");
		//һ��ʹ���������þ�̬��Ա
		Soldier.count++;
	}
	
	//��Ա����
	public void go() {
		/*
		 * this ��������
		 * ���õ�ǰ������ڴ��ַ
		 * ��ǰ�������ڵ��õĶ�������ִ����δ���Ķ���
		 * 
		 * this. ����ʡ��
		 */
		System.out.println(this.id+"��ʿ��ǰ��");
	}
	public void attack() {
		if(blood == 0) {
			System.out.println(
				"����"+id+"�ŵ�ʿ����ʬ��");
			return;
		}
		System.out.println(id+"��ʿ������");
		//�����Ѫֵ
		int d = new Random().nextInt(10);
		blood -= d;//��Ѫ
		if(blood < 0) {//Ѫ�����ܱ�ɸ���
			blood = 0;
		}
		System.out.println("Ѫ����"+blood);
		if(blood == 0) {
			System.out.println(id+"��ʿ������");
			Soldier.count--;
		}
	}
}






