/*----------------------------------------------------------------------------------------------------------------------	
	Sabitler:
	Program içerisinde doğrudan yazılan sayılara denir. Sabitlerin de türleri vardır. Derleyici sabitlerin türlerini
	tespit ederek işlem yapar. 
	Sabitlerin türlerinin tespitine ilişkin detaylar:
	- Sayı nokta içermiyorsa ve sonuna bir ek almamışsa ve int türü sınırları içerisindeyse int türdendir. Aksi durumda
	eror oluşur
	Örnek: 1000, 2000000000, 3
	
	- Sayı nokta içermiyorsa ve sonuna L (küçük veya büyük) ekini almışsa long türdendir. long türü sınırları dışında ise
	error oluşur.
	Örneğin: 10L, 4000000000L
	
	Anahtar Notlar: Küçük harf L kullanımı 1(bir) rakamına benzemesinden dolayı programlamada tercih edilmez
	
	- Java'da byte ve short türden sabitler yoktur
	
	- Sayı nokta içeriyorsa ve sonuna bir ek almamışsa double türdendir. Sayı double olarak ifade edilemiyorsa error oluşur.
	Örneğin:3.4, 6.7
	
	- Sayı nokta içersin ya da içermesin sonunda D (küçük veya büyük) eki varsa double türdendir. 
	Örnek: 3D, 3d, 3.4D
	
	- Sayı nokta içersin ya da içermesin sonunda F (küçük veya büyük) eki varsa float türdendir. 
	Örnek: 3f, 3F, 3.4F
	
	- boolean türden iki tane sabit vardır: true, false
	
	- char türden sabitler: İki tek tırnak karakteri yazılan bir karakter karakter tablosunda sıra numarası belitir. Bu 
	şekilde yazılan sabitlere karakter sabitleri denir ve bu sabitler char türdendir. İki tane tek tırnak arasında 
	özel durumlar dışında birden fazla karakter yazımı geçersizdir. Örneğin 'ş' karakter sabiti karakter tablosundaki
	sıra numarasına karşılık gelir. 
	
	Bazı karakterlerin klavyeden karakter olarak girilmesi dorğudan mümkkün değildir. Örneğin bir sonraki satıra geçme
	karakterinin karakter sabiti klavyeden bir karakter olarak basılamaz. Bazı karakterlerin görüntü karşılığı da yoktur.
	Bunlar gibi bazı karakterler de klavyeden doğrudan yazılamazalar. Bu tarz karakterlerin karakter sabitleri iki 
	tane tek tırnak arasında ters bölü karakteri ile onu takip eden özel bir karakter ile yazılır. Bu şekilde yazılan
	karakterlere "escape sequence" karakterler denir. Hatta bazı karakteler hem normal hem de ters bölü yazılabilirler.
	Java'da desteklenen escape sequence karakterler şunlardır:
	'\n' -> line feed (LF)
	'\r' -> carriage return (CR)
	'\t' -> horizontal tab
	'\b' -> backspace
	'\f' -> form feed
	'\0' -> null karakter
	...
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		char c;
		
		c = '\f';
		
		System.out.printf("c = %c%n", c);
		
	}
}


