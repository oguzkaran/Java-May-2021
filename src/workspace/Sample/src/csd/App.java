/*----------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Email adresini giriniz:");
		String email = kb.nextLine();
		
		int atIdx = email.indexOf('@');
		
		if (atIdx != -1) {
			if (email.substring(atIdx).lastIndexOf('.') == -1)
				email += ".com";
			
			System.out.println(email);				
		}
		else 
			System.out.println("Geçersiz email");
	}
}

