/*----------------------------------------------------------------------
	FILE        : Point.java
	AUTHOR      : Java-May-2021 Group
	LAST UPDATE : 06.11.2021

	Point class that represents the 2(two) dimensional point

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.sqrt;

enum CoordinateType {CARTESIAN, POLAR}

public class Point {
	public double x;
	public double y;

	private Point(double a, double b, CoordinateType coordinateType)
	{
		x = coordinateType == CoordinateType.CARTESIAN ? a : a * Math.cos(b);
		y = coordinateType == CoordinateType.CARTESIAN ? b : a * Math.sin(b);
	}

	Point(Point p)
	{
		x = p.x;
		y = p.y;
	}

	public static Point createCartesian(double a, double b)
	{
		return new Point(a, b, CoordinateType.CARTESIAN);
	}

	public static Point createPolar(double r, double theta)
	{
		return new Point(r, theta, CoordinateType.POLAR);
	}

	public double distance()
	{
		return distance(0, 0);
	}

	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}

	public double distance(double a, double b)
	{
		return sqrt((x - a) * (x - a) + (y - b) * (y - b));
	}

	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}

	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}

	public String toString()
	{
		return String.format("{x: %f, y: %f}", x, y);
	}

	//...
}