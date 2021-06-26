/*----------------------------------------------------------------------------------------------------------------------
	Basit bir menü uygulaması iskeleti
	(İleride daha iyileri yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{			
		MenuApp.run();				
	}
}

class MenuApp {
	public static void run()
	{
		Menu.run();		
	}
}

class Menu {
	public static void displayMenu()
	{
		System.out.println("1.Ekle");		
		System.out.println("2.Sil");
		System.out.println("3.Güncelle");
		System.out.println("4.Listele");
		System.out.println("5.Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void doWorkForInsert()
	{
		System.out.println("--------------------");
		System.out.println("Ekle");
		System.out.println("--------------------");
		//...
	}
	
	public static void doWorkForDelete()
	{
		System.out.println("--------------------");
		System.out.println("Sil");
		System.out.println("--------------------");
		//...
	}
	
	
	public static void doWorkForUpdate()
	{
		System.out.println("--------------------");
		System.out.println("Güncelle");
		System.out.println("--------------------");
		//...
	}
	
	public static void doWorkForList()
	{
		System.out.println("--------------------");
		System.out.println("Listele");
		System.out.println("--------------------");
		//...
	}
	
	public static void doWorkFor(int option)
	{
		if (option == 1)
			doWorkForInsert();
		else if (option == 2)
			doWorkForDelete();
		else if (option == 3)
			doWorkForUpdate();
		else		
			doWorkForList();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			displayMenu();
			int option = Integer.parseInt(kb.nextLine());
			
			if (1 <= option && option <= 5) {			
				if (option == 5)
					break;
				
				doWorkFor(option);
			}
			else
				System.out.println("Geçersiz seçenek");
		}
		
		System.out.println("Teşekkürler");
		System.out.println("Tekrar yapıyor musunuz?");
		System.out.println("C ve Sistem Programcıları Derneği");
	}
}

