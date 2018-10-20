package day0205;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数：");
		//获得输入的值
		//再保存到变量n
		int n = new Scanner(System.in).nextInt();
		
		//向右移动24,16,8,0位，再强转成byte
		//保存到变量b1,b2,b3,b4
		byte b1 = (byte) (n >> 24);
		byte b2 = (byte) (n >> 16);
		byte b3 = (byte) (n >> 8);
		byte b4 = (byte) (n >> 0);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		int r = 0;
		
		//四个字节值
		//先左移24位(如果前面是1，把1顶出去)，
		//再不带符号右移0,8,16,24位
		//再与r求位或，结果保存到r		
		r = r | (b1<<24>>>0);
		r = r | (b2<<24>>>8);
		r = r | (b3<<24>>>16);
		r = r | (b4<<24>>>24);
		
		System.out.println(r);
		
		r = 0;
		//四个字节值，和 0x000000ff 求位与
		//再左移24,16,8,0位
		//再和r求位或，结果存到r
		r = r | ((b1 & 0x000000ff) << 24);
		r = r | ((b2 & 0x000000ff) << 16);
		r = r | ((b3 & 0x000000ff) << 8);
		r = r | ((b4 & 0x000000ff) << 0);
		System.out.println(r);
	}
}








