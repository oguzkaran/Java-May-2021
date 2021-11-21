/*----------------------------------------------------------------------------------------------------------------------
	non-static bir metot çağrısında metot sanal ise derleyici "çalışma zamanında referansın dinamik türüne bak, dinamik
	türe ilişkin sınıfta metot override edilmişse onu çağır" kodunu üretir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B x = new B();
		A y;

		y = x;

		y.foo();
		y.bar(10);
	}
}

class B extends A {
	public void foo() //override
	{
		System.out.println("B.foo()");
	}

	public void bar(int a) //override
	{
		System.out.println("B.bar(int)");
	}

	public void bar(double a) //overload
	{
		System.out.println("B.bar(double)");
	}
}
class A {
	public void foo()
	{
		System.out.println("A.foo()");
	}

	public void bar(int a)
	{
		System.out.println("A.bar()");
	}
}
