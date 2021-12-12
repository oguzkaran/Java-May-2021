/*----------------------------------------------------------------------------------------------------------------------
    Files sınıfı birçok yararlı static metot barındırır. Aslında File sınıfının da içerisinde bulunan birçok yararlı
    metodu barındırır. Ancak File sınıfında da Files'da da olmayan bazı metotlar vardır. Aslında genel olarak
    Files sınıfı File sınıfının birçok işleminin daha detaylandırılmış biçimidir

    Not: Örnekte Path arayüzünün of metodunun çağrıldığına dikkat edinir. Java 11'den önce Paths sınıfının gets
    metodu çağrılmaktaydı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.io.IOException;
import java.nio.file.*;

import static org.csystem.util.console.CommandLineUtil.checkIfNotEqualAndExit;

class App {
	public static void main(String [] args)
	{
		checkIfNotEqualAndExit(args, 1, "Wrong number of arguments");

		try {
			Path path = Path.of(args[0]); //Since Java 11

			System.out.println(Files.deleteIfExists(path) ? "Directory deleted" : "Directory not deleted");
		}
		catch (DirectoryNotEmptyException ignore) {
			System.out.println("Director is not empty");
		}
		catch (IOException ignore) {
			System.err.println("Unknown error occurs");
		}
		catch (Throwable ex) {
			System.err.println(ex.getMessage());
		}
	}
}
