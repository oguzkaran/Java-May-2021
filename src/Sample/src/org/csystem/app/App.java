/*---------------------------------------------------------------------------------------------------------------------- 	 
	Aşağıdaki durumda referansa ildeğer verilmediği diziye ilkdeğer verirken new operatörü kullanılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args) 
	{
		int [] a;
		a = {1, 2, 3, 4, 5, 6, 9, 7 }; //error

		for (int i = 0; i < a.length; ++i)
			System.out.printf("%d ", a[i]);
	}
}


