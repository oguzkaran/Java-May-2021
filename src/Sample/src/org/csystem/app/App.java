/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun parametre değişkenleri final yapılabilir. Bu durumda metodun final olan parametre değişkenlerinin
	değerleri metot içerisinde değiştirilemez
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}


class Sample {
	public static void foo(final int a, int b)
	{
		++b;
		++a; //error
	}
}
