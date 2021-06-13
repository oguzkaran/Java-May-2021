/*----------------------------------------------------------------------------------------------------------------------	
 	Sınıf Çalışması: Yukarıdaki örnekte pozitif negatif sayılardan kaç tane girildiğini de bulan şekilde programı
 	güncelleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		FindPosNegSumApp.run();
	}
}

class FindPosNegSumApp {
	public static void displayResult(int posSum, int posCount, int negSum, int negCount)
	{
		if (posSum != 0)
			System.out.printf("%d tane pozitif sayının toplamı:%d%n", posCount, posSum);		
		else
			System.out.println("Hiç pozitif sayı girmediniz");
		
		if (negSum != 0) 
			System.out.printf("%d tane negatif sayının toplamı:%d%n", negCount, negSum);		
		else
			System.out.println("Hiç negatif sayı girmediniz");
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");
		
		int posSum = 0, negSum = 0;
		int posCount = 0, negCount = 0;
		int val;
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0)
			if (val > 0) {
				posSum += val;
				++posCount;
			}
			else {				
				negSum += val;
				++negCount;
			}
		
		displayResult(posSum, posCount, negSum, negCount);		
	}
}
