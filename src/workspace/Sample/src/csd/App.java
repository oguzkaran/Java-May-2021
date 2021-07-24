/*---------------------------------------------------------------------------------------------------------------------- 	 
	Sınıfın non-static veri elemanlarına sınıf dışından (başka bir sınıfın içinden) referans ve nokta operatörü ile
	erişilebilir. Sınıfın non-static veri elemanları her nesne için ayrıca nesnenin içerisinde yaratılırlar. İşte sınıf
	dışından referans ile erişilen eleman o referansın gösterdiği nesnenin elemanıdır. Her new işlemi yeni bir nesne
	yaratılmasına yol açar. Aşağıdaki kodu çalıştırıp sonucu gözlemleyiniz 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		Sample s, k;
		
		s = new Sample();
		k = new Sample();
		
		s.a = 10;
		s.b = true;
		
		k.a = 20;
		k.b = false;
		
		System.out.printf("s.a = %d%n", s.a);
		System.out.printf("s.b = %b%n", s.b);
		
		System.out.printf("k.a = %d%n", k.a);
		System.out.printf("k.b = %b%n", k.b);
	}
}

class Sample {
	public int a;
	public boolean b;
	//...
}



