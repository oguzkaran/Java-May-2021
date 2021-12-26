/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.csystem.util.console.CommandLineUtil.checkIfNotEqualAndExit;

public class ReaderApp {
    public static void main(String[] args)
    {
        checkIfNotEqualAndExit(args, 1, "Invalid arguments");

        try (BufferedReader br = Files.newBufferedReader(Path.of(args[0]), StandardCharsets.UTF_8)) {
            String line;

            while ((line = br.readLine()) != null)
                System.out.printf("Text:%s, Length:%d%n", line, line.length());
        }
        catch (FileNotFoundException ignore) {
            System.err.println("File not found");
        }
        catch (IOException ex) {
            System.err.printf("Exception occurs:%s", ex.getMessage());
        }
    }
}