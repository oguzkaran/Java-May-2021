/*----------------------------------------------------------------------------------------------------------------------	
	Gerçek sayı sabitlerinin üstel (bilimsel) gösterilişi
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		double a = 1.3E10;
		double b = 1.3e10;
		double c = 1.3E-10;
		double d = 1.3e-10;
		
		
		System.out.printf("a = %f%n", a);
		System.out.printf("b = %f%n", b);
		System.out.printf("c = %.12f%n", c);
		System.out.printf("d = %.12f%n", d);
	}
}
