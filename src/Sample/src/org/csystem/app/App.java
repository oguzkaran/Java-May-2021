/*---------------------------------------------------------------------------------------------------------------------- 	 
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarının toplamını döndüren sum isimli metodu
	ArrayUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args) 
	{
		SumIntArrayTest.run();
	}
}

class SumIntArrayTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Min değerini giriniz:");
		int min = Integer.parseInt(kb.nextLine());

		System.out.print("Max değerini giriniz:");
		int max = Integer.parseInt(kb.nextLine());

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}


