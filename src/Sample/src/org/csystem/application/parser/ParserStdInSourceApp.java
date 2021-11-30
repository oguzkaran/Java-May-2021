package org.csystem.application.parser;

import java.util.Scanner;

public final class ParserStdInSourceApp {
    private ParserStdInSourceApp()
    {
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Parser parser = new Parser();

        for (;;) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            System.out.println("--------------------------------------------");
            StringSource ss = new StringSource(s);
            CharArraySource cs = new CharArraySource(s);
            parser.setSource(ss);
            System.out.printf("Boşluk sayısı:%d%n", parser.countWhitespaces());
            parser.setSource(cs);
            System.out.printf("Boşluk sayısı:%d%n", parser.countWhitespaces());
            System.out.println("--------------------------------------------");
        }
    }
}
