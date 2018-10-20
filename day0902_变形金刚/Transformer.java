package day0804;

public class Transformer {
	//变形金刚使用的武器接口
	private Weapon w;//null
	
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	
	public void attack() {
		if(w == null) {
			System.out.println("用牙咬");
			return;
		}
		
		// 使用冷兵器倚天剑进攻
		// 把类别代码，转成类别字符串
		String type = toString(w.getType());
		// 武器名
		String name = w.getName();
		
		System.out.println(
		 "使用"+type+name+"进攻");
		
		w.kill();
		
	}

	private String toString(int type) {
		String s = "";
		
		switch(type) {
		case Weapon.TYPE_COLD: s="冷兵器"; break;
		case Weapon.TYPE_HOT: s="热兵器"; break;
		case Weapon.TYPE_NUCLEAR: s="核武器"; break;
		}
		
		return s;
	}
}








