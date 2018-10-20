package day0503;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 1. 关闭项目 close project
		 * 2. 过滤项目列表，隐藏关闭的项目
		 */
		
		char[][] a = {
				{'渭','城','朝','雨','浥','轻','尘'},
				{'客','舍','青','青','柳','色','新'},
				{'劝','君','更','尽','一','杯','酒'},
				{'西','出','阳','关','无','故','人'}				
		};
		/*
		 * 西劝客渭
		 * 出君舍城
		 * 阳更青朝
		 * 关...
		 */

		//i下标遍历内部数组
		for(int i=0; i<a[0].length; i++) {
			//j循环反向遍历外围数组
			for(int j=a.length-1; j>=0; j--) {
				System.out.print(a[j][i]);
			}			
			System.out.println();
		}
		
	}
}





