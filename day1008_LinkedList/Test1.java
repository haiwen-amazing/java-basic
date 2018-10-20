package day1008;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * <> 泛型
		 *    限制集合中，存放的数据类型
		 *    泛型不支持基本类型，要是包装类型
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
		//下标1位置插入 "###"
		list.add(1, "###");
		System.out.println(list);
		//删除下标1位置
		list.remove(1);
		System.out.println(list);
		//取值
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		//双向链表，下标遍历，效率低
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//双向链表，迭代器遍历，效率高
		//新建迭代器对象，保存到变量it
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {//当还有数据
			String s = it.next();//取下一个数据
			System.out.println(s);
		}
	}
}






