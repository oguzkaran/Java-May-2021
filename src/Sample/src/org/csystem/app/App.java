/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte referanslara ilişkin türler için toString metodu çağrılarak yazı birleştirmesi yapılır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.Date;
import org.csystem.util.datetime.Time;
import org.csystem.util.math.Fraction;
import org.csystem.util.math.geometry.Point;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		Random r = new Random();
		Date date = Date.random(r);
		Time time = Time.random(r);
		Fraction fraction = new Fraction(3, 4);
		Point point = Point.createCartesian(100.7, 200.4);

		System.out.println("Tarih:" + date); //System.out.println("Tarih:" + date.toString());
		System.out.println("Zaman:" +  time); //System.out.println("Zaman:" +  time.toString());
		System.out.println("Kesir:" + fraction); //System.out.println("Kesir:" + fraction.toString());
		System.out.println("Nokta:" + point); //System.out.println("Nokta:" + point.toString());
	}
}