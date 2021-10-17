/*----------------------------------------------------------------------------------------------------------------------
	Date sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.Date;

class App {
	public static void main(String [] args)
	{
		Date d = new Date(19, 10, 2021);

		System.out.println(d.toLongDateStringTR());
		System.out.println(d.toLongDateStringEN());

		d.setDay(23);
		System.out.println(d.toLongDateStringTR());
		System.out.println(d.toLongDateStringEN());
	}
}
