/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizisinin bir matris olup olmadığını test eden isMatrix
	isimli metodu ve kare matris olup olmadığını test eden isSquareMatrix isimli metodu yazınız ve aşağıdaki kod ile
	test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		IsMatrixTest.run();
		IsSquareMatrixTest.run();
	}
}


class IsMatrixTest {
	public static void run()
	{
		int [][] a = {{1, 2}, {3, 4, 5}, {6, 7}};
		int [][] b = {{1, 2}, {3, 4}, {5, 6}};

		System.out.println(ArrayUtil.isMatrix(a) ? "Matris" : "Matris değil");
		System.out.println(ArrayUtil.isMatrix(b) ? "Matris" : "Matris değil");
	}
}
class IsSquareMatrixTest {
	public static int [][] getArray(Random r, int row, int col)
	{
		return r.nextBoolean() ? ArrayUtil.getRandomMatrix(r, row, col, 0, 99) : ArrayUtil.getRandomSquareMatrix(r, row, 0, 99);
	}

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

			int [][] a = getArray(r, m, n);
			ArrayUtil.display(2, a);
			System.out.println("------------------");
			System.out.println(ArrayUtil.isSquareMatrix(a) ? "Kare matris" : "Kare matris değil");
		}
	}
}


