/*---------------------------------------------------------------------------------------------------------------------- 	 
	 Sınıfın non-static bir veri elemanına sınıf dışından sınıf ismi ve nokta operatörü ile erişilemez
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		//...
		Sample.a = 10; //error		
		Sample.b = true; //error
	}
}

class Sample {
	public int a;
	public boolean b;
}