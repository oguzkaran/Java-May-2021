/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte C sınıfı için foo metodu public olarak override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A a = new A();
		IX ix = a;

		ix.foo();
	}
}

class C extends B implements IX { //error: Geçerli olsaydı IX için foo metodunun erişim belirleyicisi düşürülmüş olurdu

}


class A extends B implements IX {
	protected void foo()
	{
		System.out.println("A.foo");
	}
}


class B {
	protected void foo()
	{
		System.out.println("B.foo");
	}
}

interface IX {
	void foo();
}

