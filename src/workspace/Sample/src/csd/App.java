/*----------------------------------------------------------------------------------------------------------------------	
	 Random sınıfının nextDouble metodu [min, max) aralığında rasgele double türden sayı üretilmesi	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Random r = new java.util.Random();
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		double min = Double.parseDouble(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		double max = Double.parseDouble(kb.nextLine());
		
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%.10f%n", r.nextDouble() * (max - min) + min); //[mi, max)	
	}
}


