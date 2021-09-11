/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarını yine parametresi ile aldığı değer
	karıştıran yani elemanlarının yerlerini değiştiren shuffle isimli metodu ArrayUtil sınıfı içerisinde yazınız ve
	aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		ShuffleIntArrayTest.run();
	}
}

class ShuffleIntArrayTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;

			int [] a = ArrayUtil.getRandomArray(r, n, 0, 99);

			ArrayUtil.display(2, a);
			ArrayUtil.shuffle(r, a, 100);
			ArrayUtil.display(2, a);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}
