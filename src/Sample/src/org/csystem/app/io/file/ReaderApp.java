/*----------------------------------------------------------------------------------------------------------------------
    FileInputStream sınıfının File türden ve String türden ctor'ları varolan bir dosyayı dosya göstericisi başta olacak
    şekilde açar. Eğer dosya yoksa FileNotFoundException nesnesi fırlatılır. Okuma işlemi en temel olarak read isimli
    bir metot ile yapılabilir. read metodu dosya sonuna gelindiğinde -1 değerine geri döner. read metodunun başarı
    durumunda döndürdüğü değerin 1 byte'lık değerinde bilgi saklanır. Bu durumda programcı tür dönüştürme operatörü
    kullanarak byte türüne dönüştürme yaparak değeri elde edebilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.csystem.util.console.CommandLineUtil.checkIfNotEqualAndExit;

public class ReaderApp {
    public static void main(String[] args)
    {
        checkIfNotEqualAndExit(args, 1, "Invalid arguments");

        try (FileInputStream fis = new FileInputStream(args[0])) {
            int result;

            while ((result = fis.read()) != -1)
                System.out.printf("%d ", (byte)result);

            System.out.println();
        }
        catch (FileNotFoundException ignore) {
            System.err.println("File not found");
        }
        catch (IOException ignore) {
            System.err.println("IO problem occurs. Try again later!...");
        }
    }
}
