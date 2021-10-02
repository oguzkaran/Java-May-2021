/*----------------------------------------------------------------------------------------------------------------------
 	Aşağıdaki durumlardan en az biri varsa veri elemanının gizlenmesi gerekir:
 	- Sınıfın geliştirilmesinde versiyon ilerledikçe bir veri elemanının isminin hatta türünün değişmesine çok sık rastlanır.
 	Bu durumda eski müşteri kodların bu değişimdn etkilenmemesi için veri elemanı gizlenmelidir

 	- Bir veri elemanının sınır değerleri olabilir. Bu değerlerin kontrol edilip değiştirilebilmesi için veri elemanı
 	gizlenmelidir

 	- Bir veri elemanının değer değiştiğinde başka bir veri elemanının değerinin değişen elemana göre tekrar belirlenmesi
 	gerekebilir. Bu durumda da veri elemanı gizlenmelidir

 	- Bir veri elemanı değiştiğinde yeni değere göre bazı işlemlerin yapılması gerekebilir. Örneğin, bir dosya ismini
 	alan bir sınıf bu isme göre dosyayı "açar". Açılan bir dosyanın "kapatılması" gerekir. O nesne için dosya ismi değiştiğinde
 	eski dosyanın kapatılıp yeni dosyanın açılması gerekir. Bu durumda da veri elemanı gizlenmelidir.

 	- Bazı durumlarda veri elemanının gizlenmmesi gerekmese bile gizleyebilir. Örneğin sınıfın tüm veri elemanları bir ya da
 	birkaç sebepten dolayı gizlenmiş olabilir. Ancak bir veri elemanı yukarıda yazılan durumların hiçbirisi olmayabilir.
 	Bu durumda diğer elemanlar da gizlendiği için gizlenmesi uygun olabilir.

 	Bu durumlar dışında (%3 ile %5 arasında) sınıfın veri elemanları public yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Date birthDate = new Date(6, 9, 2021);

		System.out.printf("%02d/%02d/%04d%n", birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());

		birthDate.setDay(11);
		birthDate.setMonth(7);
		birthDate.setYear(1983);

		System.out.printf("%02d/%02d/%04d%n", birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
	}
}

class Date {
	private int m_day, m_month, m_year;
	private int m_dayOfWeek;
	//...

	public Date(int day, int month, int year)
	{
		//...
		m_day = day;
		m_month = month;
		m_year = year;
		//...
	}

	public int getDay()
	{
		return m_day;
	}

	public void setDay(int val)
	{
		//...
		m_day = val;
		//...
	}

	public int getMonth()
	{
		return m_month;
	}

	public void setMonth(int val)
	{
		//...
		m_month = val;
		//...
	}

	public int getYear()
	{
		return m_year;
	}

	public void setYear(int val)
	{
		//...
		m_year = val;
		//...
	}

	public int getDayOfWeek()
	{
		return m_dayOfWeek;
	}

	//...
}
