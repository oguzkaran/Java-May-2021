package org.csystem.application.io.file;

import java.io.File;

public final class FileDeleteApp {
    private static void listFiles(File dir)
    {
        for (File file : dir.listFiles())
            System.out.println(file.delete() ? "Success" : "Fail");
    }

    private FileDeleteApp()
    {}

    public static void run(String [] args)
    {
        if (args.length != 1) {
            System.err.println("Wrong number of arguments");
            System.exit(1);
        }

        File dir = new File(args[0]);

        if (dir.exists()) {
            if (dir.isDirectory())
                listFiles(dir);
            else
                System.out.printf("'%s' not directory%n", dir.getAbsolutePath());
        }
        else
            System.out.printf("'%s' not exists%n", dir.getAbsolutePath());

    }
}
