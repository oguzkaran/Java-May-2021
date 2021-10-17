/*----------------------------------------------------------------------------------------------------------------------
	IntValue sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.IntValue;

class App {
	public static void main(String [] args)
	{
		IntValue iVal1 = IntValue.TEN;
		IntValue iVal2 = IntValue.of(3);
		IntValue [] result;

		result = iVal1.divideWithRemainder(iVal2);
		System.out.printf("Result:%s%n", result[0].toString());
		System.out.printf("Remainder:%s%n", result[1].toString());
	}
}
