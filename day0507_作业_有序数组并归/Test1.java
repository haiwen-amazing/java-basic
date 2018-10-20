package day0507;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int[] a = suiJi();
		int[] b = suiJi();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int[] c = heBing(a, b);
		System.out.println(Arrays.toString(c));
	}
	
	private static int[] heBing(int[] a, int[] b) {
		//新建数组，长度是两个数组长度和
		
		/*
		 * a[j]
		 * b[k]
		 * c[i]
		 * 
		 * b [1,2,3,4,5,6,8,9]
		 *          k
		 * c [---------              ]
		 *             i
		 */
		
		int[] c = new int[a.length+b.length];
		for(int i=0,j=0,k=0; i<c.length; i++) {
			if(j>=a.length) {
				System.arraycopy(
						b,k,c,i,b.length-k);
				break;
			}
			if(k>=b.length) {
				System.arraycopy(
						a,j,c,i,a.length-j);
				break;
			}
			
			if(a[j]<b[k]) {
				c[i] = a[j];
				j++;
			} else {
				c[i] = b[k];
				k++;
			}
		}
		return c;
	}

	private static int[] suiJi() {
		int len = 5 + new Random().nextInt(6);
		int[] a = new int[len];
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}
}
