package day0103;
import java.math.BigDecimal;
//导包
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入降落时间（秒）：");
		//获得输入的值
		//再保存到变量t
		double t = 
		 new Scanner(System.in).nextDouble();
		
		//套公式，计算降落距离，
		//保存到变量 d
		//double d = 0.5*9.8*t*t;
		BigDecimal a = BigDecimal.valueOf(4.9);
		BigDecimal b = BigDecimal.valueOf(t);
		double d = 
		 a.multiply(b.pow(2)).doubleValue();
		
		
		
		System.out.println(t+"秒降落了"+d+"米");      
	}
}




