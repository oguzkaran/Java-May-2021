/*----------------------------------------------------------------------------------------------------------------------
	AnalyticalCircle sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.geometry.AnalyticalCircle;
import org.csystem.util.math.geometry.Point;

class App {
	public static void main(String [] args)
	{
		Point p = new Point(100, 100);
		AnalyticalCircle ac = new AnalyticalCircle(3.5, p);

		System.out.println("-------------------------");
		System.out.printf("Radius:%f%n", ac.getRadius());
		System.out.printf("Circumference:%f%n", ac.getCircumference());
		System.out.printf("Area:%f%n", ac.getArea());
		System.out.printf("{x: %d, y: %d}%n", ac.getX(), ac.getY());
		System.out.println("-------------------------");
	}
}

