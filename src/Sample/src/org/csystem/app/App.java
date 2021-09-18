/*----------------------------------------------------------------------------------------------------------------------
	ArrayUtil sınıfının drawHistogram metodu. Homework-011 için merkezi limit teoremi için önce bu metodu kullanınız.
	Daha sonra drawHistogram metodunu çalışma sorusunda anlatıldığı biçimde yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		DrawHistogramTest.run();
	}
}

class DrawHistogramTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;

			int [] a = ArrayUtil.getRandomArray(r, n, 0, 10);
			//ArrayUtil.display(a);
			int [] hist = ArrayUtil.getHistogramData(a, 10);

			ArrayUtil.display(hist);

			System.out.println("Histogram:");

			ArrayUtil.drawHistogram(hist, 10, 'X');
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

