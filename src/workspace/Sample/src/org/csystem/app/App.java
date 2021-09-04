/*---------------------------------------------------------------------------------------------------------------------- 	 
	Homework-008-4. sorunun bir çözümü		
	(Not: Çözüm çalışma sorusunun verildiği tarihte görülen konulara göre yapılmıştır)	
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args) 
	{				
		SqueezeTest.run();
	}
}

class SqueezeTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		for (;;) {
			System.out.print("Birinci yazı giriniz:");
			String s1 = kb.nextLine();
			
			System.out.print("İkinci yazı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.println(StringUtil.squeeze(s1, s2));			
			
			if ("elma".equals(s1))
				break;					
		}
		
		System.out.println("Tekrar yapıyor musunuz?");				
	}
}

class StringUtil {
	public static String squeeze(String s1, String s2)
	{
		String str = "";
		int length = s1.length();
		
		for (int i = 0; i < length; ++i) {
			char ch = s1.charAt(i);
			
			if (!s2.contains(ch + ""))
				str += ch;
		}			
		
		return str;
	}
}

