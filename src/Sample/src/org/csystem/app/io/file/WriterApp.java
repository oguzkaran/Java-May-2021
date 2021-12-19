/*----------------------------------------------------------------------------------------------------------------------
    FileOutputStream sınıfının File türden ve String türden tek parametreli ctor'ları yeni bir dosya yaratıp dosyayı açar.
    Eğer dosya varsa dosyayı sıfırlayarak (yani bilgileri kaybederek) açar. Yazma işlemi için en temel metot bir byte'lık
    bilgiyi yazan write metodudur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import java.io.FileOutputStream;
import java.io.IOException;

import static org.csystem.util.console.CommandLineUtil.*;

public class WriterApp {
    public static void main(String[] args)
    {
        checkIfNotEqualAndExit(args, 2, "Invalid arguments");

        try (FileOutputStream fos = new FileOutputStream(args[0])) {
            int count = Integer.parseInt(args[1]);

            for (int i = 0; i < count; ++i)
                fos.write((byte)i);
        }
        catch (NumberFormatException ignore) {
            System.err.println("Invalid number format");
        }
        catch (IOException ignore) {
            System.err.println("IO problem occurs. Try again later!...");
        }
    }
}
