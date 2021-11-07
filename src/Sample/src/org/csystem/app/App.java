/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		SampleAFactory factory = new SampleAFactory();
		A x;

		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());

		while (n-- > 0) {
			System.out.println("--------------------------------------------");
			x = factory.getRandomA();
			System.out.println(x.getClass().getName());

			if (x instanceof B) {
				B b = (B)x;

				b.foo();
			}
			else
				System.out.println("B veya B'den türemiş bir tür değil");

			System.out.println("--------------------------------------------");
		}
	}
}

class SampleAFactory {
	private final Random m_random = new Random();

	public A getRandomA()
	{
		int val = m_random.nextInt(3);
		A x;

		switch (val) {
			case 0:
				x = new B();
				break;
			case 1:
				x = new C();
				break;
			default:
				x = new D();
		}

		return x;
	}
}

class D extends A {
	//...
}

class C extends B {
	//...
}

class B extends A {
	public void foo()
	{
		System.out.println("B.foo");
	}

	//..
}

class A {
	//...
}
