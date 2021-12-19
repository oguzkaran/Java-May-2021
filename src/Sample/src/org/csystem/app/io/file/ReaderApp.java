/*----------------------------------------------------------------------------------------------------------------------
    FileInputStream sınıfının byte dizi parametreli read metotları byte türden dizinin içerisine dosyadaki bilgileri
    okur. Ne kadar okuduğu miktarı ile de geri döner. Bu durumda programcının ne kadar okunduğu miktarına göre dizinin
    elemanlarını kullanması gerekir. Yani aslında dizinin uzunluğu ya da okumak için verilen sayı en fazla ne kadar
    okunacağını belirtir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import org.csystem.util.array.ArrayUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.csystem.util.console.CommandLineUtil.checkIfNotEqualAndExit;

public class ReaderApp {
    public static void main(String[] args)
    {
        checkIfNotEqualAndExit(args, 2, "Invalid arguments");

        try (FileInputStream fis = new FileInputStream(args[0])) {
            byte [] data = new byte[Integer.parseInt(args[1])];
            int result;

            while ((result = fis.read(data)) > 0)
                ArrayUtil.display(result, ' ', '\n', data);
        }
        catch (NumberFormatException ignore) {
            System.err.println("Invalid block size");
        }
        catch (FileNotFoundException ignore) {
            System.err.println("File not found");
        }
        catch (IOException ignore) {
            System.err.println("IO problem occurs. Try again later!...");
        }
    }
}
