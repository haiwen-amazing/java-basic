package day0901;

public class Test2 {
	public static void main(String[] args) {
		Weapon w = f1();
		w.kill();
		System.out.println(w);
		
		System.out.println("-----------------");
		
		Weapon w2 = f2("���컭�");
		w2.kill();
		System.out.println(w2);
	}

	private static Weapon f2(String name) {
		
		
		Weapon w = new Weapon() { 
			//���������ھֲ��ڲ����У�
			//����һ����ͬ�ı���
			//Ϊ�˱������������ֵ��һ��
			//������������������޸ģ�����ɳ���
			//final String name;
			
			@Override
			public void kill() {
				/*
				 * �ֲ��ڲ����У�
				 * ʹ�������һ���ֲ�������
				 * �����final
				 */
				System.out.println(
				 "ʹ��"+name+"����");
			}
		};
		
		
		return w;
		
	}
	
	
	

	private static Weapon f1() {
		class AK47 implements Weapon {
			@Override
			public void kill() {
				System.out.println("ʹ��AK47����");
			}
		}
		
		AK47 a = new AK47();
		return a;		
	}
}










