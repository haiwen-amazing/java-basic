package day0701;

public abstract class Pet {

	String name;//Ĭ��ֵnull
	int full;//Ĭ��ֵ0
	int happy;//Ĭ��ֵ0

	// �����еȹ� 
	public Pet(String name) {
		this.name = name;
		this.full = 50;
		this.happy = 50;
	}
	
	public Pet(String name,int full,int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	
	public void feed() {
		if(full == 100) {
			System.out.println(name+"�Ѿ��Բ�����");
			return;
		}
		System.out.println("��"+name+"ιʳ");
		full += 10;
		System.out.println("��ʳ�ȣ�"+full);
	}
	
	public void play() {
		if(full == 0) {
			System.out.println(name+"�����治����");
			return;
		}
		System.out.println("��"+name+"��ˣ");
		full -= 10;
		happy += 10;
		System.out.println(
		 "��ʳ�ȣ�"+full+"�����ֶȣ�"+happy);
	}
	
	public void punish() {
		System.out.println(
			"��"+name+"��pp��"+name+"�޽У�"+cry());
		happy -= 10;
		System.out.println("���ֶȣ�"+happy);   
	}
	
	// ���󷽷�
	// ֻ�з����Ķ��壬û�з��������
	public abstract String cry();
}







