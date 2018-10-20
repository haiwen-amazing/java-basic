package day0601;

import java.util.Random;

/*
 * 封装：
 *     把士兵相关的数据、运算方法，
 *     封装成一个“类”组件
 *     
 *     对士兵，做抽象定义
 *     
 *     模板、图纸
 */
public class Soldier {
	//属性变量，成员变量
	int id;//默认0
	int blood = 100;
	
	//静态的士兵计数变量
	//在方法区，Soldier类内存空间中，
	//只保存一份
	//不会在实例的内存空间中保存多份
	static int count; 
	//静态的士兵价格变量
	static final int PRICE = 6;
	
	//构造方法
	public Soldier() {
		System.out.println("执行了构造方法");
		//一般使用类名调用静态成员
		Soldier.count++;
	}
	
	//成员方法
	public void go() {
		/*
		 * this 特殊引用
		 * 引用当前对象的内存地址
		 * 当前对象：正在调用的对象、正在执行这段代码的对象
		 * 
		 * this. 可以省略
		 */
		System.out.println(this.id+"号士兵前进");
	}
	public void attack() {
		if(blood == 0) {
			System.out.println(
				"这是"+id+"号的士兵的尸体");
			return;
		}
		System.out.println(id+"号士兵进攻");
		//随机减血值
		int d = new Random().nextInt(10);
		blood -= d;//减血
		if(blood < 0) {//血量不能变成负数
			blood = 0;
		}
		System.out.println("血量："+blood);
		if(blood == 0) {
			System.out.println(id+"号士兵阵亡");
			Soldier.count--;
		}
	}
}






