package day0601;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.print("ʿ��������");
		int n = new Scanner(System.in).nextInt();
		ArrayList<Soldier> list = new ArrayList<>(n);
		//1��n��ʿ��
		for(int i=1; i<=n; i++) {
			Soldier s = new Soldier();
			s.id = i;//i��ֵ��Ϊʿ����id
			list.add(s);
		}
		System.out.println("ʿ��������"+list.size());
		
		//�����д���ʿ��
		while(list.size() != 0) {
			//���س�
			new Scanner(System.in).nextLine();
			//n�Σ������ѡn��ʿ������
			/*for(int i=0;list.size()!=0 && i<n;i++) {
				//�������һ��ʿ��
				int j = new Random().nextInt(list.size());
				Soldier s = list.get(j);
				s.attack();
				//ʿ������
				if(s.blood == 0) {
					list.remove(j);//�Ӽ��ϰ�ʿ���Ƴ� 
				}
			}*/
			
			for(Iterator<Soldier> it = list.iterator(); it.hasNext(); ) {
				Soldier s = it.next();
				s.attack();
				if(s.blood == 0) {
					//���������ڼ䣬������ֱ���ü�����ɾ����
					//list.remove(s);
					it.remove();//ɾ���ո�ȡ����ʿ��
				}
			}
			
			System.out.println("ʿ��������"+list.size());
			System.out.println("-------------------");
		}
		
	}
}








