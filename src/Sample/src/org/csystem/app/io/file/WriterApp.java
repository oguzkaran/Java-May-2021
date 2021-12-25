/*----------------------------------------------------------------------------------------------------------------------
    ByteBuffer sınıfı ile int türden bir bilginin byte dizisine çevrilmesi için bir yöntem
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;

import static org.csystem.util.console.CommandLineUtil.checkIfNotEqualAndExit;

public class WriterApp {
    public static void main(String[] args)
    {
        checkIfNotEqualAndExit(args, 2, "Invalid arguments");

        Random r = new Random();

        try (FileOutputStream fos = new FileOutputStream(args[0], true)) {
            int count = Integer.parseInt(args[1]);

            while (count-- > 0) {
                double val = r.nextDouble();

                byte [] data = ByteBuffer.allocate(Double.BYTES).putDouble(val).array();

                System.out.printf("%f%n", val);
                fos.write(data);
            }
        }
        catch (NumberFormatException ignore) {
            System.err.println("Invalid number format");
        }
        catch (IOException ignore) {
            System.err.println("IO problem occurs. Try again later!...");
        }
    }
}

