/*----------------------------------------------------------------------------------------------------------------------
	Homework-001-3. sorunun bir çözümü
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{			
		SignumTest.run();
	}
}

class SignumTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
		
			
			System.out.printf("signum(%d) = %d%n", a, NumberUtil.signum(a));
			
			if (a == 0)
				break;				
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int signum(int val)
	{
		if (val > 0)
			return 1;
		
		if (val == 0)
			return 0;
		
		return -1;
	}	
}


