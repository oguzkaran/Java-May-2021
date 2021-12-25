/*----------------------------------------------------------------------------------------------------------------------
    WriterApp
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Scanner;

import static org.csystem.util.console.CommandLineUtil.checkIfNotEqualAndExit;

public class WriterApp {
    public static void main(String[] args)
    {
        checkIfNotEqualAndExit(args, 1, "Invalid arguments");

        Scanner kb = new Scanner(System.in);

        try (FileOutputStream fos = new FileOutputStream(args[0], true)) {
            for (;;) {
                System.out.print("Input a text:");
                String text = kb.nextLine();

                if ("quit".equals(text))
                    break;

                byte [] data = text.getBytes();
                byte [] dataLen = ByteBuffer.allocate(Short.BYTES).putShort((short)data.length).array();

                fos.write(dataLen);
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

