/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ? işereti açılımı kullanılmıştır. Bu herhangi bir tür demektir. Ancak Object gibi düşünülmemelidir.
	Bu durumun kullanımı uygulama kursunda ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A<?> a;

		a = new A<String>();

		a.foo("ankara"); //error
		a.bar();
	}
}

enum A<T> { //error
	//...
}

class MyException<T> extends RuntimeException { //error
	//...
}

c