/*----------------------------------------------------------------------------------------------------------------------
	Integer sınıfının (aslında tüm tamsayı türlerine ilişkin sarmalayan sınıfların) ilişkin olduğu temel tür paraemtreli
	valueOf metotları [-128, 127] aralığındaki değerleri bir ön bellekte (cache) tutar. Böyleikle daha efektif bir çalışma
	saplanır. Bu aralık dışındaki değerlerin ön bellekte tutulacağı garanti değildir.
	Dikkat: IntValue sınıfının kodlarını tekrar inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int value = 127;
		Integer iVal1 = Integer.valueOf(127);
		Integer iVal2 = Integer.valueOf(value);

		System.out.println(iVal1 == iVal2 ? "Aynı nesne" : "Farklı nesneler");

		Integer iVal3 = Integer.valueOf(128);
		Integer iVal4 = Integer.valueOf(128);

		System.out.println(iVal3 == iVal4 ? "Aynı nesne" : "Farklı nesneler");
	}
}



