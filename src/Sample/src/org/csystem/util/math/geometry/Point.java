/*----------------------------------------------------------------------
	FILE        : Point.java
	AUTHOR      : Java-May-2021 Group
	LAST UPDATE : 05.09.2021

	Point class that represents the 2(two) dimensional point

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.sqrt;

public class Point {
	public int x;
	public int y;
	
	public Point()
	{		
	}
	
	public Point(int a)
	{
		x = a;
	}
	
	public Point(int a, int b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(int a, int b)
	{
		return sqrt((x - a) * (x - a) + (y - b) * (y - b));
	}
	
	public void offset(int dxy)
	{		
		offset(dxy, dxy);	
	}
	
	public void offset(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return String.format("{x: %d, y: %d}", x, y);
	}	
	
	//...
}