/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Aşağıda açıklanan metotları yazınız.
	
	public static String padLeading(String s, int length, char ch);
	public static String padLeading(String s, int length);
	public static String padTrailing(String s, int length, char ch);
	public static String padTrailing(String s, int length);
	
	Açıklamalar:
	- padLeading metodunun 3 parametreli overload'u ikinci parametresi ile aldığı length birinci parametresi ile
	aldığının uzunluğundan büyükse yazıyı soldan üçüncü parametresi ile aldığı karakter ile doldurulmuş yeni bir
	String referansına geri dönecektir.
		Örneğin:
		padLeading("ankara", 11, 'x'); çağrısı
		xxxxxankara 
		yazısını döndürecektir
	
	- length uzunluğu yazının uzunluğundan küçük veya eşitse aynı referansa geri dçnecektir.
	- padLeading metodunun 2 parametreli overload'u yazıyı soldan space karakteri ile dolduracaktır
	- padTrailin metotşarı benzer şekilde sağdan dolduracak şekilde yazılacaktır 
	- Örneği Java 11+ için yazınız		
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		PadLeadingTrailingTest.run();	
	}
}


class PadLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();			
			
			if ("elma".equals(s))
				break;
			
			System.out.print("Bir sayı giriniz:");
			int newLength = Integer.parseInt(kb.nextLine());			
			
			
			System.out.printf("(%d)%n", StringUtil.padLeading(s, newLength, 'x'));
			System.out.printf("(%d)%n", StringUtil.padLeading(s, newLength));
			System.out.printf("(%d)%n", StringUtil.padTrailing(s, newLength, 'x'));			
			System.out.printf("(%d)%n", StringUtil.padTrailing(s, newLength));			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class StringUtil {
	public static String padLeading(String s, int length, char ch)
	{
		
	}
	
	public static String padLeading(String s, int length)
	{
		
	}
	
	public static String padTrailing(String s, int length, char ch)
	{
		
	}
	
	public static String padTrailing(String s, int length)
	{
		
	}

}





