/*----------------------------------------------------------------------------------------------------------------------
 	Aşağıdaki örnekte Date sınıfının içsel tasarımı ve algoritması değişmesine rağmen müşteri kodlar bundan etkilenmemiştir.
 	Detayları gözardı ederek sadece değişten sonra müşteri kodların etkilenmemesine odaklanınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Date birthDate = new Date(6, 9, 2021);

		System.out.printf("%02d/%02d/%04d%n", birthDate.getDay(), birthDate.getMonthValue(), birthDate.getYear());

		birthDate.setDay(11);
		birthDate.setMonthValue(7);
		birthDate.setYear(1983);

		System.out.printf("%02d/%02d/%04d%n", birthDate.getDay(), birthDate.getMonthValue(), birthDate.getYear());
	}
}

class Date {
	private String m_dateStr;
	private int m_dayOfWeek;

	public Date(int day, int month, int year)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", day, month, year);
		//calculate dayOfWeek
	}

	public int getDay()
	{
		return Integer.parseInt(m_dateStr.substring(0, 2));
	}

	public void setDay(int val)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", val, getMonthValue(), getYear());
		//calculate dayOfWeek
	}
	
	public int getMonthValue()
	{
		return Integer.parseInt(m_dateStr.substring(3, 5));
	}

	public void setMonthValue(int val)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", getDay(), val, getYear());
		//calculate dayOfWeek
	}

	public int getYear()
	{
		return Integer.parseInt(m_dateStr.substring(6));
	}

	public void setYear(int val)
	{
		//...
		m_dateStr = String.format("%02d/%02d/%04d", getDay(), getMonthValue(), val);
		//calculate dayOfWeek
	}

	public int getDayOfWeek()
	{
		return m_dayOfWeek;
	}
}
