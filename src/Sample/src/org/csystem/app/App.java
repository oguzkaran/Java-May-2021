/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnek için enum kullanılamaz. Çünkü başka renklerin de programcı tarafından üretilmesi gerekir. Bu durumda
	nesne yaratılması gerekir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Singleton s1 = Singleton.INSTANCE;
		Singleton s2 = Singleton.INSTANCE;

		System.out.println(s1 == s2);
	}
}

enum Singleton {
	INSTANCE;
	private int m_a;

	public int getA()
	{
		return m_a;
	}

	public void setA(int a)
	{
		//...
		m_a = a;
	}
	//...
}


