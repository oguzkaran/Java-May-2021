/*---------------------------------------------------------------------------------------------------------------------- 	 
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarını parametresi ile aldığı min ve max değerleri
	için [min, max] aralığında rasgele değerlerle dolduran fillRandomArray isimli metodunu ArrayUtil sınıfı içerisinde
	yazınız aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.display;
import static org.csystem.util.array.ArrayUtil.fillRandomArray;

class App {
	public static void main(String [] args) 
	{
		FillRandomIntArrayTest.run();
	}
}

class FillRandomIntArrayTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Min değerini giriniz:");
		int min = Integer.parseInt(kb.nextLine());

		System.out.print("Max değerini giriniz:");
		int max = Integer.parseInt(kb.nextLine());

		Random r = new Random();

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;

			int [] a = new int[n];

			fillRandomArray(r, a, min, max);

			display(a);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}


