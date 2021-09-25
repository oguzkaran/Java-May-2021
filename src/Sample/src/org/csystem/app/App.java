/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizi dizisinin elemanlarının toplamını döndüren
	sum isimli metodu ArrayUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		SumTest.run();
	}
}

class SumTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Satır sayısını giriniz:");
			int m = Integer.parseInt(kb.nextLine());

			if (m <= 0)
				break;
			System.out.print("Sütun sayısını giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			int [][] a = ArrayUtil.getRandomMatrix(r, m, n, 0, 99);
			ArrayUtil.display(2, a);
			System.out.println("------------------");
			System.out.printf("Toplam:%d%n", ArrayUtil.sum(a));
		}
	}
}


