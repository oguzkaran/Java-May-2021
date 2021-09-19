/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı en fazla üç basamaklı bir sayının Türkçe okunuşunu döndüren numberToText3DigitsTR
	metodunu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz. Metot 3 basamaktan büyü sayılar
	kontrol yapmayacaktır

	123 -> yüzyirmiüç
	345 -> üçyüzkırkbeş
	103 -> yüzüç
	230 -> ikiyüzotuz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.number.NumberUtil;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		NumberToText3DigitsTRTest.run();
	}
}

class NumberToText3DigitsTRTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());

			System.out.printf("%d:%s%n", val, NumberUtil.numberToText3DigitsTR(val));

			if (val == 0)
				break;
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

