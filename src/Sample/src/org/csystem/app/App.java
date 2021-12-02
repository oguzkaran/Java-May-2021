/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte foo metodu MyException fırlatıldığında onu yakalamış ve aynı nesneyi yeniden fırlatmıştır. Bu işleme
    "rethrow" denir.

    Aşağıdaki örnekte foo metodu müşteri kodları açısından MyException da fırlatabilir. Bu foo için dokümana yazılır. foo
    metodunu yazan programcı açısından ise MyException hem iligili try bloğunda işlenmiş hem de aynı exception nesnesi
    müşteri koda fırlatılmış olur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		try {
			Sample.foo();
			System.out.println("main:try sonu");
		}
		catch (YourException ex) {
			System.out.println("main:YourException yakalandı");
		}
		catch (MyException ex) {
			System.out.println("main:MyException yakalandı");
		}
		catch (Throwable ex) {
			System.out.println("main:Exception yakalandı");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Sample {
	public static void foo()
	{
		try {
			Scanner kb = new Scanner(System.in);
			System.out.print("Bir sayı giriniz:");
			double val = Double.parseDouble(kb.nextLine());

			System.out.printf("log(%.2f) = %f%n", val, MathUtil.myLog(val));
			System.out.println("foo:try sonu");
		}
		catch (MyException ex) {
			System.out.println("foo:MyException yakalandı");
			throw ex;
		}
		System.out.println("foo sonu");
	}
}

class MathUtil {
	public static double myLog(double val)
	{
		if (val == 0)
			throw new MyException();

		if (val < 0)
			throw new YourException();

		return Math.log(val);
	}
}

class MyException extends RuntimeException {
	//...
}

class YourException extends RuntimeException {
	//...
}
