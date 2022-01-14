package org.csystem.application.io.file.ncharacters;

import org.csystem.util.console.CommandLineUtil;

import java.io.IOException;

public final class NumberOfCharacterInFileApp {
    private static char checkAndGetChar(String arg)
    {
        int len = arg.length();

        if (len > 2) {
            System.out.println("Invalid argument");
            System.exit(1);
        }

        return arg.charAt(0);
    }

    private NumberOfCharacterInFileApp()
    {
    }

    public static void run(String [] args)
    {
        CommandLineUtil.checkIfNotEqualAndExit(args, 2, "Wrong number of arguments");
        checkAndGetChar(args[1]);

        char ch = checkAndGetChar(args[1]);

        try (NumberOfCharacterInFile nocf = new NumberOfCharacterInFile(args[0], ch)) {
            nocf.run();
            System.out.println(nocf.getCount());
        }
        catch (IOException ignore) {
            System.err.println("IOError occurs");
        }
    }
}
