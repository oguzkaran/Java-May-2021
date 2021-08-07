/*----------------------------------------------------------------------------------------------------------------------	
	String sınıfının yazı içerisinde karakter arayan indexOf metodu
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		String s = "İyi bir Java programcısı olmak için çok çalışmak gerekir";
		char ch = 'x';
		
		int idx = s.indexOf(ch);
		
		System.out.printf("Index:%d%n", idx);
	}
}
