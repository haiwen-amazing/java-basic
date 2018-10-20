package day0804;

public class Transformer {
	//���ν��ʹ�õ������ӿ�
	private Weapon w;//null
	
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	
	public void attack() {
		if(w == null) {
			System.out.println("����ҧ");
			return;
		}
		
		// ʹ����������콣����
		// �������룬ת������ַ���
		String type = toString(w.getType());
		// ������
		String name = w.getName();
		
		System.out.println(
		 "ʹ��"+type+name+"����");
		
		w.kill();
		
	}

	private String toString(int type) {
		String s = "";
		
		switch(type) {
		case Weapon.TYPE_COLD: s="�����"; break;
		case Weapon.TYPE_HOT: s="�ȱ���"; break;
		case Weapon.TYPE_NUCLEAR: s="������"; break;
		}
		
		return s;
	}
}








