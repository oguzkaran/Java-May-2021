/*----------------------------------------------------------------------------------------------------------------------
	void metotlar geri dönüş değeri varmış gibi çağrılamaz. Yani void metot çağrısı geri dönüş değeri varmış gibi
	işleme sokulamaz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		NumberUtil.displaySquare();
		NumberUtil.displaySquare();
	}
}


class NumberUtil {
	public static void displaySquare()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());	
		
		System.out.println(val * val);
		//...
	}
}


