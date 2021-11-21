/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının trimToSize metodu capacity değerini size değerine getirir. Bu metot O(n) karmaşıklıktadır.
    Bu sebeple bu metodun sürekli veya gereksiz yere çağrılmaması gerekir. trimToSize metodu size değeri sıfır ise
    genel olarak capacity değerini de sıfıra çeker
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.collection.CSDArrayList;
import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class App {
	public static void main(String[] args)
	{
		CSDArrayList passwords = new CSDArrayList();
		Random r = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.print("Kaç tane şifre üretilsin?");
		int n = Integer.parseInt(kb.nextLine());

		for (int i = 0; i < n; ++i)
			passwords.add(StringUtil.getRandomTextTR(r, r.nextInt(6) + 5));

		System.out.println(passwords.toString());
		System.out.printf("Capacity:%d%n", passwords.capacity());
		System.out.printf("Size:%d%n", passwords.size());
		System.out.println("--------------------------");

		passwords.trimToSize();

		System.out.printf("Capacity:%d%n", passwords.capacity());
		System.out.printf("Size:%d%n", passwords.size());
		System.out.println("--------------------------");

		passwords.clear();
		passwords.trimToSize();

		System.out.printf("Capacity:%d%n", passwords.capacity());
		System.out.printf("Size:%d%n", passwords.size());
		System.out.println("--------------------------");
	}
}
