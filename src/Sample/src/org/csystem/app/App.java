/*---------------------------------------------------------------------------------------------------------------------- 	 
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarını ters yüz eden reverse isimli metodu
	başka bir dizi kullanmadan yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

class App {
	public static void main(String [] args) 
	{
		ReverseIntArrayTest.run();
	}
}

class ReverseIntArrayTest {
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

			int [] a = getRandomArray(r, n, min, max);

			display(a);
			reverse(a);
			display(a);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}


