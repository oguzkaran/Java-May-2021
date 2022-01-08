/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Komut satırı argümanı olarak aldığı iki tane dosyanın özdeş olup olmadıklarını test eden programı
    yazınız. Programın ismini dilediğiniz gibi verebilirsiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.application.io.file.filecompare.FileCompareApp;

class App {
	public static void main(String [] args)
	{
		FileCompareApp.run(args);
	}
}
