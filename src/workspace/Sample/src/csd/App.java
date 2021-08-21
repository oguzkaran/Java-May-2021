/*---------------------------------------------------------------------------------------------------------------------- 	 
	Java 7 ile birlikte switch deyiminde String de kullanılabilmektedir. Bu durumda case bölümlerinin "String literal"
	olması gerekir. String sınıfı switch deyimi ile kullanıldığında karşılaştırma equals metodu ile yapılır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Şehir isimini giriniz:");
		String cityName = kb.nextLine();
		
		switch (cityName.toLowerCase()) {
		case "istanbul":
		case "edirne":
		case "tekirdağ":
			System.out.println("Marmara bölgesi");
			break;
		case "zonguldak":
		case "sinop":
		case "bartın":
			System.out.println("Batı karadeniz bölgesi");
			break;
		default:
			System.out.println("Belirsiz isim");
		}	
	}
}



