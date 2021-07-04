/*----------------------------------------------------------------------------------------------------------------------
 	Metot çağrısında argümanlar ile parametrelerinin türlerinin birebir uyumlu olduğu bir metot sınıfta varsa o çağrılır
 	(best match) 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		double b = 20;
		
		Sample.foo(a, b);
	}
}


class Sample {
	public static void foo(double a, int b) //imza: foo, double, int
	{
		System.out.println("Sample.foo(double, int)");		
	}	
	
	public static void foo(int b, double a) //imza: foo, int, double
	{
		System.out.println("Sample.foo(int, double)");
	}
	
	public static void foo(int a) //imza:foo, int
	{
		System.out.println("Sample.foo(int)");
	}
	
	public static void foo() //imza: foo
	{
		System.out.println("Sample.foo()");
	}
	
	public static void bar() //imza: bar
	{
		System.out.println("Sample.bar()");
	}
}



