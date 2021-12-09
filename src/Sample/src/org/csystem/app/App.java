/*----------------------------------------------------------------------------------------------------------------------
	4. Bir sınıf referansının onun desteklemediği bir arayüz referansına dönüştürülmesi:
	Bu işlem tür dönüştürme operatörü ile yapılabilir. Çalışma zamanı sırasında kaynak referansın
	dinamik türünün hedef arayüzü destekleyip desteklemediğine bakılır. Destekliyorsa haklı dönüşümdür. Desteklemiyorsa
	haksız dönüşümdür, ClassCastException fırlatılır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A a = new B();
		IX ix;

		ix = (IX)a; //Haklı dönüşüm

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class B extends A {
	//...
}

class A {
	//...
}

interface IX {
	//...
}
