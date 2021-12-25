/*----------------------------------------------------------------------------------------------------------------------
   Sınıf Çalışması: Komut satırından aşağıdaki gibi çalışan programı yazınız
        java org.csystem.app.App file1 file2 ... fileN dest

    - Program file1, file2, file3, ..., fileN ile belirtilen dosyaları birleştirerek dest ile belirtilen dosyaya
    ekleyecektir
    - Files sınıfı ve Path arayüzünü kullanabilirsiniz
    - Hedef dosya varsa üzerine yazılacaktır (overwrite)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.application.io.file.copy.ConcatFilesApp;

class App {
	public static void main(String [] args)
	{
		ConcatFilesApp.run(args);
	}
}
