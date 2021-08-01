/*----------------------------------------------------------------------------------------------------------------------	
	ctor içerisinde veri elemanlarına değer ataması çok kullanılır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s1 = new Sample(-10, true);
		Sample s2 = new Sample(20);
		
		System.out.printf("s1.x = %d%n", s1.x);
		System.out.printf("s1.y = %b%n", s1.y);
		
		System.out.printf("s2.x = %d%n", s2.x);
		System.out.printf("s2.y = %b%n", s2.y);
		//...
	}
}


class Sample {
	public int x;
	public boolean y;	
	
	public Sample(int a)
	{
		x = Math.abs(a);		
	}
	
	public Sample(int a, boolean b)
	{
		x = Math.abs(a);
		y = b;
	}
	
	
		
	//...
}