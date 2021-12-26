/*----------------------------------------------------------------------------------------------------------------------
    Klavye işlemleri için BufferedReader sınıfı aşağıdaki gibi kullanılabilir. Sınıfın metotlarının IOException fırlattığına
    dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class App {
	public static void main(String [] args) throws IOException
	{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String str = kb.readLine();

			if ("elma".equals(str))
				break;

			byte [] data = str.getBytes(StandardCharsets.UTF_8);
			System.out.printf("Length:%d%n", data.length);
		}
	}
}
