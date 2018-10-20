package day0804;

public class Dao implements Weapon{
	@Override
	public void kill() {
		 System.out.println("Ë£µ¶");
	}
	@Override
	public String getName() {
		return "ÍÀÁúµ¶";
	}
	@Override
	public int getType() {
		return Weapon.TYPE_COLD;
	}
}
