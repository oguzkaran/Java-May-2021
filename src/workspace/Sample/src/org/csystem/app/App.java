/*---------------------------------------------------------------------------------------------------------------------- 	 
	Java 5 ile birlikte import static bildirimleri eklenmiltir. import static bildirimlerinin de iki biçimi vardır:
	1. Yıldızlı import static bildirimi (import static on demand declaration)
	2. Yıldızsız import static bildirimi (import static single type declaration)
	
	import static bildirimleri okunabirliliği etkilemedikten sonra kodu yalınlaştırır. Okunabilirliği etkilememesine
	dikkat edilmelidir. import static bildirimleri de import bildirimleri ile aynı yerde yazılır ve sıranın önemi
	yoktur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import test.Sample; //error

class App {
	public static void main(String [] args) 
	{
       Sample s = new Sample();
       
       s.foo();
	}
}


class Sample {
	public void foo()
	{
		System.out.println("org.csystem.app.Sample.foo");
	}
}