/*----------------------------------------------------------------------------------------------------------------------	
	Homework-004 için "Referans parametreli metotlar" konusu öğrenildiğinde yapılabilcek bir çözüm
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		CalculateSumCountMaxMinApp.run();
	}
}

class CalculateSumCountMaxMinApp {	
	public static int getValue(java.util.Scanner kb)
	{
		for (;;) {
			System.out.println("Bir tamsayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			if (0 <= val && val <= 100)
				return val;
			
			System.out.println("Geçersiz değer girdiniz!...Yeni bir değer giriniz:");
		}
	}
	
	public static int getOption(java.util.Scanner kb)
	{
		int option;
		
		do 
			option = Integer.parseInt(kb.nextLine());
		while (option != 0 && option != 1);
		
		return option;
	}
	
	public static void displayReport(int count, int sum, int min, int max)
	{
		System.out.printf("Toplam %d değer girildi%n", count);
		System.out.printf("Max = %d%n", max);
		System.out.printf("Min = %d%n", min);
		System.out.printf("Ortalama = %f%n", (double)sum / count);
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int count = 0;
		int sum = 0;
		int minVal = 100;
		int maxVal = 0;	
		int val;
		
		for (;;) {			
			val = getValue(kb);			
			++count;
			sum += val;
			minVal = Math.min(val, minVal);
			maxVal = Math.max(val, maxVal);
			
			System.out.println("Yeni bir değer girmek istiyor musunuz?[Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]");
			int option = getOption(kb);			
			if (option == 0)
				break;			
		}
		
		displayReport(count, sum, minVal, maxVal);
	}
}


