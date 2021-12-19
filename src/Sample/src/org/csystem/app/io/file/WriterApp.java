/*----------------------------------------------------------------------------------------------------------------------
    FileOutputStream sınıfının byte türden dizi parametreli write metotları ile yazma işlemi yapılabilir. Aşağıdaki
    örnekte data dizisinin eleman sayısının yarısından sonraki elemanların değerleri dosyaya yazılmaktadır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import org.csystem.util.array.ArrayUtil;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import static org.csystem.util.console.CommandLineUtil.*;

public class WriterApp {
    public static void main(String[] args)
    {
        checkIfNotEqualAndExit(args, 2, "Invalid arguments");

        Random r = new Random();

        try (FileOutputStream fos = new FileOutputStream(args[0], true)) {
            int length = Integer.parseInt(args[1]);
            byte [] data = new byte[length];

            r.nextBytes(data);

            ArrayUtil.display(data);
            fos.write(data);
        }
        catch (NumberFormatException ignore) {
            System.err.println("Invalid number format");
        }
        catch (IOException ignore) {
            System.err.println("IO problem occurs. Try again later!...");
        }
    }
}

