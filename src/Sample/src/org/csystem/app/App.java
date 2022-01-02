/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Standart cihaz bağımsız bitmap (Device Independent Bitmap) dosyasında resmin genişliği ve uzunluğu
    dosyanın başından itibaren 18'inci ve 22'inci offsetlerde int bir bilgi olarak tutulmaktadır. Formata göre bu bilgi
    "little endian" olarak yazılmıştır. Bu bilgiyi bir resim dosyasından alıp ekrana yazdıran programı yazınız. Program
    resmin geçerliliği gibi detaylı kontrolleri yapmayacaktır.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.application.io.file.image.bitmap.DIBWindowsApp;

class App {
	public static void main(String [] args)
	{
		DIBWindowsApp.run(args);
	}
}
