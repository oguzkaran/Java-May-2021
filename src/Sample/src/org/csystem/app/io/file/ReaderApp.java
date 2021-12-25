/*----------------------------------------------------------------------------------------------------------------------
    ReaderApp
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
            byte [] dataLen = new byte[Short.BYTES];

            for (;;) {
                int result = fis.read(dataLen);

                if (result == -1)
                    break;

                if (result != 2)
                    throw new IOException("File format corruption");

                short len = ByteBuffer.wrap(dataLen).getShort();

                byte [] data = new byte[len];

                result = fis.read(data);

                if (result != len)
                    throw new IOException("File format corruption");

                String text = new String(data);

                System.out.println(text);
            }
        }
        catch (FileNotFoundException ignore) {
            System.err.println("File not found");
        }
        catch (IOException ex) {
            System.err.printf("Exception occurs:%s", ex.getMessage());
        }
    }
}
