/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Paremetresi ile aldığı long bir sayının en fazla 3(üç) basamaklı ayrılmış sayılarından oluşan
	diziyi döndüren getDigitsInThrees metodunu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Örnek:1234567 -> 1 234 567
	Örnek: 9876 -> 9 876
	Örnek: 567 -> 567
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.application.date.DateUtilTest;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.number.NumberUtil;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		DateUtilTest.run();
	}
}

class GetDigitsInThreesTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			long val = Long.parseLong(kb.nextLine());

			ArrayUtil.display(NumberUtil.getDigitsInThrees(val));

			if (val == 0)
				break;
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

