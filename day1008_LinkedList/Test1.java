package day1008;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * <> ����
		 *    ���Ƽ����У���ŵ���������
		 *    ���Ͳ�֧�ֻ������ͣ�Ҫ�ǰ�װ����
		 */
		LinkedList<String> list = 
		 new LinkedList<>();
		list.add("aaa");
		list.add("ddd");
		list.add("ooo");
		list.add("bbb");
		list.add("qqq");
		list.add("aaa");
		list.add("aaa");
		System.out.println(list.size());
		System.out.println(list);
		//�±�1λ�ò��� "###"
		list.add(1, "###");
		System.out.println(list);
		//ɾ���±�1λ��
		list.remove(1);
		System.out.println(list);
		//ȡֵ
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		//˫�������±������Ч�ʵ�
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//˫������������������Ч�ʸ�
		//�½����������󣬱��浽����it
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {//����������
			String s = it.next();//ȡ��һ������
			System.out.println(s);
		}
	}
}






