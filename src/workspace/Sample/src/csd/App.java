/*----------------------------------------------------------------------------------------------------------------------	
	 Aşağıdaki koşullar ayrık olmadığından örnek bazında else-if yapılması zaten yanlış olur
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		if (val > 11)
			System.out.println("val > 11");
		if (val > 15)
			System.out.println("val > 15");
		if (val > 30)
			System.out.println("val > 30");

		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}



