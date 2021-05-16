/*----------------------------------------------------------------------------------------------------------------------
	Çağıran metot ile çağrılan metot aynı sınıftaysa ise bu durumda paket ismi yazılmamışsa sınıf ismi de yazılmayabilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		System.out.println("Hello World");
		Sample.foo();
		Sample.bar();
		Mample.tar();
		System.out.println("Goodbye World");
	}
}

class Sample {
	public static void foo() 
	{
		System.out.println("foo");
		Mample.tar();
	}

	public static void bar()
	{
		System.out.println("bar");
		foo();
	}
}

class Mample {
	public static void tar()
	{
		System.out.println("tar");
	}
}