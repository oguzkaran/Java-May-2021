/*---------------------------------------------------------------------------------------------------------------------- 	 
 	 Sınıf Çalışması: Parametresi ile aldığı bir yazının palindrom olup olmadığını test eden isPalindrome metodunu
 	 yazınız ve aşağıdaki kod ile test ediniz. 
 	 Palindrom: Yalnızca alfabetik karakterleri tersten okunduğunda aynı olan yazılara palindrom denir. Detaylar 
 	 gözardı edilmesi koşuluyla bu tanım yazılabilir.
 	 
 	 Örnek: 
 	 Ey Edip Adana'da pide ye 	-> eyedipadanadapideye
 	 Anastas mum satsana 		-> anastasmumsatsana
 	 Ali Papila					-> alipapila
 	 
 	 Açıklama: Örnek daha önce yazdığımız reverse metodu kullanılarak çok daha basit biçimde yazılabilirdi. Ancak 
 	 daha önce de belirtildiği gibi reverse metodunun ilgili versiyonu sürekli String nesnesi yarattığından böyle bir
 	 durumda tercih edilmesi uygun değildir. Ancak ileride reverse metodunu daha etkin hale getirdiğimizde kodu basitleştirmesi
 	 açısından isPalindrome metodunda reverse kullanabileceğiz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		IsPalindromeTest.run();
	}
}

class IsPalindromeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.isPalindrome(s) ? "Palindrom" : "Palindrom değil");
		}
	}
}

class StringUtil {	
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			char cLeft = Character.toLowerCase(s.charAt(left));
			
			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}
			
			char cRight = Character.toLowerCase(s.charAt(right));
			
			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}
			
			if (cLeft != cRight)
				return false;
			
			++left;
			--right;
		}
		
		return true;
	}
}


