/*----------------------------------------------------------------------------------------------------------------------	
	 Aşağıdaki örnekte rasgele üretilen ilk 10 sayının dizilimi her çalıştırmada farklı olur. Dizilimin aynı gelme 
	 olasılığı çok düşüktür. İkinci üretilen 10 sayı klavyeden alınan tohum değerine göre üretilir. Bu durumda örneğin
	 her çalıştırmada tohum değeri 100 girildiğinde ikinci 10 sayının dizilimi aynı olacaktır. Kodu çalıştırıp
	 sonucu gözlemleyiniz 	   
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();		
		
		System.out.print("Bir sayı giriniz:");
		long seed = Long.parseLong(kb.nextLine());
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%02d ", r.nextInt(100));
		
		System.out.println();
		
		r.setSeed(seed);
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%02d ", r.nextInt(100));
		
		System.out.println();
	}
}

