/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki açıklamalara
	göre haftanın hangi gününe geldiğini döndüren getDayOfWeek isimli metodu yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar: 
		- Metot geçersiz bir tarih durumunda -1 değerine geri dönecektir		
		- Haftanın günü 1.1.1900 ile verilen tariharasındaki (verilen tarih dahil) gün sayısının 7(yedi) ile bölümünden
		elde edilen kalan ile bulunabilir. Değer 0(sıfır) ise "Pazar", 1(bir) ise "Pazartesi", ... 6(altı) ise "Cumartesi" 
		günlerine karşılık gelir
		- 1.1.1900 öncesindeki tarihler geçersizler kabul edilir		
		- Parametresi ile aldığı gün, ay ve yıl bilgilerine ilişkin tarihin hafta sonu olup olmadığını test eden isWeekend
		ve hafta içi olup olmadığını test eden isWeekday metotlarını yazınız. Metotlar tarih geçerliliği kontrolü yapmayacaktır		
	(İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{			
		DateUtilTest.run();				
	}
}

class DateUtilTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün?");
			int day = Integer.parseInt(kb.nextLine());
			
			if (day == 0)
				break;
			
			System.out.print("Ay?");
			int month = Integer.parseInt(kb.nextLine());
			
			System.out.print("Yıl?");
			int year = Integer.parseInt(kb.nextLine());
			
			DateUtil.displayDateTR(day, month, year);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	public static void displayDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}
		
		switch (dayOfWeek) {
		case 0:
			System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);
			break;			
		case 1:
			System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);
			break;
		case 2:
			System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);
			break;
		case 3:
			System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);
			break;			
		case 4:
			System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);
			break;
		case 5:
			System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);
			break;
		case 6:
			System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);
			break;
		}
		
		if (isWeekend(day, month, year))
			System.out.println("Bugün kurs var tekrara yaptınız mı?");
		else
			System.out.println("Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız");
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays;
		
		if (year < 1900 || (totalDays = getDayOfYear(day, month, year)) == -1)
			return -1;
		
		for (int y = 1900; y < year; ++y) {
			totalDays += 365;
			if (isLeapYear(y))
				++totalDays;
		}
		
		return totalDays % 7;
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		return dayOfWeek == 0 || dayOfWeek == 6;		
	}
	
	public static boolean isWeekday(int day, int month, int year)
	{
		return !isWeekend(day, month, year);
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int totalDays = day;
		
		switch (month - 1) {
		case 11:
			totalDays += 30;
		case 10:
			totalDays += 31;
		case 9:
			totalDays += 30;
		case 8:
			totalDays += 31;
		case 7:
			totalDays += 31;
		case 6:
			totalDays += 30;
		case 5:
			totalDays += 31;
		case 4:
			totalDays += 30;
		case 3:
			totalDays += 31;
		case 2:
			totalDays += 28;
			if (isLeapYear(year))
				++totalDays;
		case 1:
			totalDays += 31;			
		}
		
		return totalDays;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		if (day < 1 || day > 31 || month < 1 || month > 12)
			return false;
		
		int days;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
			break;
		default:
			days = 31;
		}
		
		return day <= days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}