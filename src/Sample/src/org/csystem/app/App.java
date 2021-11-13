/*----------------------------------------------------------------------------------------------------------------------
	Sarmalayan sınıflar immutable olduğundan aşağıdaki örnekte ++ operatörünün işlemi aslında iVal referansın başka
	bir nesnenin referansının atanması demektir. Derleyici aşağıdakine benzer kodlar üretir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Integer iVal = 10;
		Integer temp = iVal;

		System.out.println(iVal == temp);

		++iVal; //iVal = Integer.valueOf(iVal.intValue() + 1);

		System.out.println(iVal == temp);
	}
}