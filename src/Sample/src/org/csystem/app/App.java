/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden int türden bir n sayısı için değer isteyiniz. n elemanlı bir String dizisi yaratınız.
	bu dizinin her bir elemanını rasgele uzunlukta rasgele üretilmiş yazılarla doldurunuz. Bu işlemden sonra ArrayUtil
	sınıfı içerisinde yazacağınız parametresi ile aldığı bir String dizisinin elemanlarını, yine parametresi aldığı bir
	ayraç ile birleştirilmiş bir String'e geri dönen join isimli metodu çağırarak sonucu ekrana yazdırınız
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

