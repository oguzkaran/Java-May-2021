/*---------------------------------------------------------------------------------------------------------------------- 	 
 	 Genel olarak söylemek gerekirse Scanner'ın çalışma sistematiği dolayısıyla nextInt, nextLong ve nextDouble 
 	 gibi metotlar aynı Scanner nesnesine ilişkin nextLine metodu akışta çağrılmamalıdır. Bu yüzden kalvye işlemlerinde
 	 nextLine metodu dıiımdakileri tercihetmiyoruz. Aşağıdaki programı çalıştırarak sonucu gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Öğrenci numarasını giriniz:");
			int number = kb.nextInt();
			
			if (number == 0)
				break;
			
			System.out.print("Öğrencinin ismini giriniz:");
			String name = kb.nextLine();
			
			System.out.printf("%d, %s%n", number, name);
		}		
	}
}

