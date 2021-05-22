/*----------------------------------------------------------------------------------------------------------------------
	Java'da içerisine değer verilmemiş bir değişken kullanılamaz yani içerisinde değer varmış gibi işleme sokulamaz.
	Yerel değişkelere değer verme programcının sorumluğundadır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int a;
		int b;
		
		b = a * 2; //error
		
		System.out.println(a); //error
	}
}

