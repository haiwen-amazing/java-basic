package day0703;

public class GuessLetterGame extends GuessGame{
	@Override
	public String suiJi() {
		//��ʱ����ɣ���д�ٴ���
		return "ABCDE";
	}
	@Override
	public void tiShi() {
		System.out.println("�Ѿ�������5�����ظ���д��ĸ");
		System.out.println("�����5����ĸ");
	}
	@Override
	public String biJiao(String c, String r) {
		//��ʱ����ɣ���д�ٴ���
		return "2A2B";
	}
	@Override
	public boolean caiDui(String j) {
		return "5A0B".equals(j);
	}
}
