/*----------------------------------------------------------------------------------------------------------------------
    ByteBuffer sınıfının wrap isimli metodu kullanılarak byte türden dizi sarmalanıp ilgili türe dönüştürülebilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

import static org.csystem.util.console.CommandLineUtil.checkIfNotEqualAndExit;

public class ReaderApp {
    public static void main(String[] args)
    {
        checkIfNotEqualAndExit(args, 1, "Invalid arguments");

        try (FileInputStream fis = new FileInputStream(args[0])) {
            byte [] data = new byte[Double.BYTES];
            int result;

            while ((result = fis.read(data)) > 0) {
                var val = ByteBuffer.wrap(data, 0, result).getDouble();

                System.out.printf("%f%n", val);
            }
        }
        catch (FileNotFoundException ignore) {
            System.err.println("File not found");
        }
        catch (IOException ignore) {
            System.err.println("IO problem occurs. Try again later!...");
        }
    }
}
