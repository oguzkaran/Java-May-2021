/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Klavyeden bir kullanıcı adı ve şifre isteyen basit bir ATM uygulamasının bir parçasını aşağıdaki
	açıklamalara göre yazınız.
	
	 Açıklamalar:
	 - Kullanıcı ad ve şifresi en fazla 3(üç) kez denenebilecektir.
	 
	 - Denemeler sırasında doğru giriş yapılırsa "Giriş başarılı", başarısız denemelerde "Giriş başarısız", 3. denemede de
	 başarısız olunursa "Giriş başarısız . Artık deneme hakkınız bitti" mesajla verilecektir.
	 
	 - Kullanıcı adı ve şifrenin doğruluğu program içerisinde belirlenen bir kullanıcı adı ve şifre ile yapılacaktır 
	 
	 - Örnekte ATM uygulaması sürekli çalışmaktadır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		ATMApp.run(3);
	}
}

class ATMApp {
	public static void doWorkForSuccess(ATMCard card, java.util.Scanner kb)
	{
		System.out.println("Giriş başarılı");
		//...
	}
	
	public static void doWorkForFail(ATMCard card, java.util.Scanner kb)
	{
		System.out.println("Giriş başarısız . Artık deneme hakkınız bitti");
		//...
	}
	
	public static void doWorkForCard(ATMCard card, int tryNum, java.util.Scanner kb)
	{
		int i = 0;
		
		for (; i < tryNum; ++i) {
			System.out.print("Kullanıcı adını giriniz:");
			String username = kb.nextLine();
			System.out.print("Şifreyi giriniz:");
			String password = kb.nextLine();
			
			if (card.isValid(username, password))
				break;	
			
			if (i != tryNum - 1)
				System.out.printf("Giriş başarısız. %d giriş hakkınız kaldı%n", tryNum - 1 - i);
		}		
		
		if (i != tryNum)
			doWorkForSuccess(card, kb);
		else
			doWorkForFail(card, kb);
	}
	
	public static void run(int tryNum)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.println("Hoşgeldiniz!...");
			ATMCard atmCard = new ATMCard();
			
			doWorkForCard(atmCard, tryNum, kb);			
		}
	}
}

class ATMCard {
	public String username;
	public String password;
	//...
	
	public ATMCard()
	{
		//Burada kartın içinden okunuyor olarak düşüneilirsiniz
		username = "csd";
		password = "1234";			
	}
	
	public boolean isValid(String uname, String passwd)
	{
		return uname.equals(username) && passwd.equals(password);
	}
	
	//...
}