/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte miv referansına null atanması derleyicinin "değer verilmeme ihtimali olan bir değişkeni kullanıyorsun"
	şeklindeki hata durumunu engellemek için kullanılmıştır. Şüphesiz program farklı şekilde de yazılabilir. Durumu
	göstermek için bu şekilde yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.wrapper.MutableIntValue;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());

		if (val < 1 || val > 3) {
			System.out.println("Geçersiz değer girdiniz");
			System.exit(1);
		}

		MutableIntValue miv;

		switch (val) {
			case 1:
				miv = new MutableIntValue(-128);
				break;
			case 2:
				miv = new MutableIntValue(0);
				break;
			case 3:
				miv = new MutableIntValue(127);
				break;
		}

		System.out.printf("Value=%d%n", miv.getVal());
	}
}

