package org.csystem.application.parser;

import org.csystem.util.console.CommandLineUtil;

import java.io.FileNotFoundException;
import java.io.IOException;

public final class DigitParserFileSourceApp {
    private DigitParserFileSourceApp()
    {
    }

    public static void run(String [] args)
    {
        CommandLineUtil.checkIfNotEqualAndExit(args, 1, "Wrong number of arguments");

        ParseFactory factory = new ParseFactory();

        try (FileAsciiSource fs = new FileAsciiSource(args[0])) {
            Parser parser1 = factory.getParser(ParserType.DIGIT, fs);
            Parser parser2 = factory.getParser(ParserType.WHITESPACE, fs);

            System.out.printf("Number of digits:%d%n", parser1.doParse());
            System.out.printf("Number of whitespaces:%d%n", parser2.doParse());
        }
        catch (FileNotFoundException ignore) {
            System.err.println("File Not found");
        }
        catch (IOException ignore) {
            System.err.println();
        }

    }
}
