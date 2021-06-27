/*----------------------------------------------------------------------------------------------------------------------	
	Yukarıda anlatılan byte, short ve char türlerine ilişkin istisna kurallar metot çağrısında argümanlardan 
	parametrelere yapılan atama işleminde geçersizdir. Bu durumun detayları ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{			
		Sample.foo(10); // error
		Sample.bar(23); // error
		Sample.tar(23); // error		
	}
}

class Sample {
	public static void foo(short val)
	{
		//...		
	}	
	
	public static void bar(byte val)
	{
		//...		
	}
	
	public static void tar(char c)
	{
		//...
	}
}

