/*---------------------------------------------------------------------------------------------------------------------- 	 
	 Referans parametreli metotlar yazılabilir. Metot içerisinde referans parametresine geçilen adrese ilişkin
	 nesneye erişilebilir. Nesne üzerinde değişiklik yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		Date birthDate = new Date();
		
		birthDate.day = 10;
		birthDate.month = 9;
		birthDate.year = 1976;
		
		DateUtil.display(birthDate);
		
		DateUtil.changeDate(birthDate, 11, 7, 1983);
		
		DateUtil.display(birthDate);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	public static void changeDate(Date d, int day, int month, int year)
	{
		//...
		d.day = day;
		d.month = month;
		d.year = year;
	}
	
	public static void display(Date d)
	{
		System.out.printf("%02d/%02d/%04d%n", d.day, d.month, d.year);
	}
}

class Date {
	public int day, month, year;
	//...
}
