/*----------------------------------------------------------------------------------------------------------------------
    Aşağı seviyede heap'de tahsis edilen nesnelere dinamik tahsis edilen (dinamik ömürlü) nesneler denir. Bu nesnelerin
    yok edilmesi Java'da "çöp toplayıcı (garbage collector)" denilen ve arka planda çalışan bir akış tarafından yapılır.
    Çöp toplayıcı "artık kullanılmayan (garbage collected, eligible) yani çöp olan nesneleri yok eder. Burada 3(üç) tane
    temel soru sorulabilir:
    1. Programcı bir nesneyi yok edebilir mi?
    2. Çöp olan yani artık kullanılmayan (garbage collected/eligible) bir nesne çöp olur olmaz yokedilir mi? Yani çöp
    toplayıcı hemen devreye girer mi?
    3. Çöp toplayıcı yok edilmesi gereken bir nesneyi nasıl anlar?

    Cevap 1: Java'da programcı bir nesneyi yok edemez. Yani tahsis edilmiş bir alanı geri bırakamaz (free/delete). Programcı
    kod akışı içerisinde nesneyi yok edilebilir (garbage collected) duruma getirebilir.

    Cevap 2: Çöp toplayıcının ne zaman devreye gireceği standartlarda belirtilmemiştir. Bu, çöp toplayıcı ile birlikte JVM
    ve JRE yazanlara bırakılmıştır (implementation defined.) Hemen devreye gireceği garanti değildir. Programcı bu bilinçle
    ve çöp toplayıcının etkinliğine güvenerek kod yazar.

    Cevap 3: Bir nesnenin yok edilebilir yani çöp duruma gelmesi o nesneyi gösteren hiç bir referansın kalmaması demektir.
    Yani nesnenin adresinin hiçbir referans tarafından gösterilmiyor duruma gelmesidir. Bir nesnenin hangi referanslar
    tarafından tutulduğu ve özellikle kaç tane referans tarafından tutulduğunun takibi için çeşitli algoritmalar
    kullanılmaktadır. Bu algoritmanın ne ve nasıl olacağı da da yazanlara bırakılmıştır. Biz burada "referans sayma (reference counting)"
    algoritması kullanılıyor varsayımıyla açıklama yapacağız. Referans sayacı yönteminde her yaratılan nesne için bir referansı sayacı
    tutulur (bu sayaç genelde nesnenin içerisinde tutulur.) Bu yöntemde nesnenin adresi yeni bir referansa atandığında
    sayaç 1(bir) artırılır. Nesne bir referanstan kopartıldığında sayaç 1(bir) azaltılır. Sayacı sıfır olan yani
    hiçbir referans tarafından gösterilmeyen bir nesne artık yok edilebilir (garbage collected) duruma gelmiş olur. Program
    sonlandığında tüm nesneler yok edilir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s;

		s = new Sample(); //rc1:1

		{
			Sample k;

			k = s; //rc1:2

			Mample.foo(k); //rc1:3 -> rc1:4
			//rc1:3 -> rc1:2
		} //rc1:1
		s = new Sample(); //rc1:0 (garbage collected), rc2:1
		//...
	}
}

class Mample {
	public static void foo(Sample s)
	{
		Sample k;

		//...

		k = s;

		//...
	}
}

class Sample {
	//...
}
