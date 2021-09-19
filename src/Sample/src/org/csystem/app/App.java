/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden int türden bir n sayısı için değer isteyiniz. n elemanlı bir String dizisi yaratınız.
	bu dizinin her bir elemanını rasgele uzunlukta rasgele üretilmiş İngilizce karakterlerden oluşan yazılarla doldurunuz.
	Bu işlemden sonra StringUtil sınıfı içerisinde yazacağınız parametresi ile aldığı bir String dizisinin elemanlarını,
	yine parametresi aldığı bir	ayraç ile birleştirilmiş bir String'e geri dönen join isimli metodu çağırarak sonucu
	ekrana yazdırınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		JoinWithDelimiterAppEN.run();
	}
}

class JoinWithDelimiterAppEN {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;

			String [] texts = StringUtil.getRandomStringArrayTR(r, n, 5, 10);
			ArrayUtil.display(texts);

			System.out.println("-------------------------------");
			System.out.printf("Full Text:%s%n", StringUtil.join(texts, "; "));
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
