/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının basamaklarından oluşan diziyi döndüren getDigits
	isimli metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Açıklama: Metot negatif sayılar için basamak değerlerini pozitif olarak verecektir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.number.NumberUtil;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		GetDigitsTest.run();
	}
}

class GetDigitsTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			long n = Long.parseLong(kb.nextLine());

			int [] digits = NumberUtil.getDigits(n);

			ArrayUtil.display(digits);

			if (n == 0)
				break;
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
