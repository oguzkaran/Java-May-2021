/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ** ve *** ile belirtilen deyim yazılsa da yazılmasa da aynı anlamdadır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		C x = new C();
		System.out.println("----------------");
		C y = new C(10);

	}
}
class C extends B {
	public C()
	{
		super(); //**
		System.out.println("C.C()");
	}

	public C(int x)
	{
		super(x);
		System.out.println("C.C(int)");
	}
}
class B extends A {
	public B()
	{
		super(); //***
		System.out.println("B.B()");
	}

	public B(int x)
	{
		super(x);
		System.out.println("B.B(int)");
	}
	//...
}

class A {
	public A()
	{
		System.out.println("A.A()");
	}

	public A(int a)
	{
		System.out.println("A.A(int)");
	}
	//...
}

