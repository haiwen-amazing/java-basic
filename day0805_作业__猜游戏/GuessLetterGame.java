package day0703;

public class GuessLetterGame extends GuessGame{
	@Override
	public String suiJi() {
		//暂时不完成，先写假代码
		return "ABCDE";
	}
	@Override
	public void tiShi() {
		System.out.println("已经产生了5个不重复大写字母");
		System.out.println("请猜这5个字母");
	}
	@Override
	public String biJiao(String c, String r) {
		//暂时不完成，先写假代码
		return "2A2B";
	}
	@Override
	public boolean caiDui(String j) {
		return "5A0B".equals(j);
	}
}
