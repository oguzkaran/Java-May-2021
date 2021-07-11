/*---------------------------------------------------------------------------------------------------------------------- 	 
 	Homework-003-8. sorunun bir çözümü 	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		DisplayCollatzTest.run();
	}
}

class DisplayCollatzTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		for (;;) {
			System.out.print("Pozitif bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			if (val == 0)
				break;
				
			NumberUtil.displayCollatz(val);			
		}
	}
}

class NumberUtil {	
	public static void displayCollatz(int n)
	{
		if (n <= 0) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		System.out.println(n);
		
		while (n != 1)			
			System.out.println(n = n % 2 == 0 ? n / 2 : 3 * n + 1);	
	}
}



