/*----------------------------------------------------------------------------------------------------------------------
	Taban sınıf türünden bir referans türemiş sınıf türünden bir referansa doğrudan atanamaz. Bu işlem tür dönüştürme
	operatörü ile (explicit) yapılabilir (downcasting). Burada tür dönüştürme operatörü derlemeden geçmek için
	kullanılır. Çalışma zamanında kaynak referansın dinamik türünün tür dönüştürme operatörüne yazılan türü kapsayıp
	kapsamadığına bakılır. Kapsıyorsa haklı dönüşümdür, akış devam eder, kapsamıyorsa haksız dönüşümdür exception
	oluşur. Buradaki kapsama nesnesel kapsamadır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		A x;
		B y;

		x = val > 0 ? new B() : new A();

		System.out.println(x.getClass().getName());

		y = (B)x; //downcasting

		y.a = 10;
		Sample.foo(y);
		System.out.println("---------------------------");
		System.out.println(x.getClass().getName());
	}
}

class Sample {
	public static void foo(B x)
	{
		x.a = 20;
		x.b = 30;
	}
}

class B extends A {
	public int b;
	//...
}

class A {
	public int a;

	//...
}
