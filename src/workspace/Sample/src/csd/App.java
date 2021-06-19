/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
 	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.
 	
 	Örnekteki test kodunda sonsuz döngüye girilmiş ve bir koşula bağlı olarak run metodu sonlandırılmıştır. Bu durumda
 	sonsuz döngüden de çıkılmış olur 	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		CountDigitsTest.run();
	}
}


class CountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);	
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());			
			int count = NumberUtil.countDigits(val);
			
			System.out.printf("%d sayısının basamak sayısı:%d%n", val, count);
			
			if (val == 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}
		}		
	}
}

class NumberUtil {
	public static int countDigits(int val)
	{		
		int count = 0;
	
		do {
			++count;
			val /= 10;
		} while (val != 0);					
		
		return count;
	}
}
