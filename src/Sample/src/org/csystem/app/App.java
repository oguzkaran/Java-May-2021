/*----------------------------------------------------------------------------------------------------------------------
	Programlamada 1(bir) byte'lık bölge kullanılmaz. Yani bu 1(bir) byte'lık bölge herhangi bir şekilde bir
	değişken ya da bir nesne için tahsis edilmez. Bu bölgenin adresine "null adres" denir. null adres modern sistemlerin
	hemen hemen hepsinde belleğin ilk gözüdür yani sıfır numaralı adrestir. Ancak sıfır numaralı adres olma zorunluluğu
	yoktur. Kullanılmayan bir adres olmalıdır. Java'da null adres "null" isimli bir sabit ile temsil edilir. Bu sabit
	"null reference" denir. Bir referansa null sabiti atandığında o referansın içerisinde bir adres vardır ancak adres
	kullanılmadığı için herhangi bir nesnenin adresi olmaz. null referans değer türlerine atanmaz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int a = null; //error
		Sample s;
		Color c;
		String str;
		int [] b;

		s = null;
		c = null;
		str = null;
		b = null;
	}
}


class Sample {
	//...
}

enum Color {

}
