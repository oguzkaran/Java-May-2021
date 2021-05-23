/*----------------------------------------------------------------------------------------------------------------------
	Çağıran metot ile çağrılan metot aynı sınıftaysa ise bu durumda paket ismi yazılmamışsa sınıf ismi de yazılmayabilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		IX ix = new IX() {
			@Override
			public void foo()
			{
				//...
			}
		};
		//...
	}
}

interface IX {
	void foo();
}