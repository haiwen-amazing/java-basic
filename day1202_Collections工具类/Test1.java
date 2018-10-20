package day1202;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(
		 list,
		 "4","12","1","26",	"2",
		 "48","3","19","31");
		System.out.println(list);
		
		Collections.sort(list);//����
		System.out.println(list);

		// sort(list, �Ƚ���)
		// �ѱȽ������󣬽���sort()����ʹ��
		Collections.sort(list, new Comparator<String>() {
			/*
			 * o1��o2�ȴ�С
			 * o1������
			 * o1С������
			 * ��ͬ��0
			 */
			@Override
			public int compare(String o1, String o2) {
				int a = Integer.parseInt(o1);
				int b = Integer.parseInt(o2);
				//a  -2147000000
				//b  1000000000
				//return a-b;
				if(a<b) {
					return -1;
				} else if(a>b) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		System.out.println(list);
	}
}






