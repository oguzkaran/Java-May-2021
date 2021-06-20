/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyel değerini döndüren factorial isimli 
	metodu NumberUtil sınıfı içersinde yazınız ve aşağıdaki kodu ile test ediniz.
	
	0! = 1
	1! = 1
	1! 1 * 2
	
	...
	
	n! = 1 * 2 * ... * (n - 1) * n	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		FactorialTest.run();
	}
}


class FactorialTest {
	public static void run()
	{		
		int n = 13;
		
		for (int i = 0; i <= n; ++i)
			System.out.printf("%d! = %d%n", i, NumberUtil.factorial(i));
	}
}

class NumberUtil {
	public static int factorial(int n)
	{
		int result = 1;
		
		for (int i = n; i >= 2; --i)
			result *= i;
		
		return result;
	}	
}
