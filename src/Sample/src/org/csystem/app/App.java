/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir kare matrisin esas köşegeni (diagonal) üzerindeki sayıların
	toplamını döndüren sumDiagonal isimli metodu yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
	- Metot karematris olup olmadığına bakmayacaktır
	- Bir kare matrisin esas köşegeni üzerindeki sayılar, örneğin:
	1 2 3
	4 5 6
	7 8 9
	matrisi için 1 5 ve 9'dur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		SumDiagonalTest.run();
	}
}

class SumDiagonalTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n <= 0)
				break;

			int [][] a = ArrayUtil.getRandomSquareMatrix(r, n, 0, 99);
			ArrayUtil.display(2, a);
			System.out.println("------------------");
			System.out.printf("Esas köşegen toplamı:%d%n", ArrayUtil.sumDiagonal(a));
		}
	}
}


