/*----------------------------------------------------------------------
	FILE        : Circle.java
	AUTHOR      : Java-May-2021 Group
	LAST UPDATE : 31.10.2021

	AnalyticalCircle class that represents the analytical circle in geometry

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

public class AnalyticalCircle extends Circle {
    private final Point m_center;

    public AnalyticalCircle()
    {
        this(0);
    }

    public AnalyticalCircle(int x, int y)
    {
        this(0, x, y);
    }

    public AnalyticalCircle(double r)
    {
        this(r, 0, 0);
    }

    public AnalyticalCircle(Point center)
    {
        this(0, center);
    }

    public AnalyticalCircle(double r, Point center)
    {
        this(r, center.x, center.y);
    }

    public AnalyticalCircle(double r, int x, int y)
    {
        super(r);
        m_center =  new Point(x, y);
    }

    public int getX()
    {
        return m_center.x;
    }

    public void setX(int x)
    {
        m_center.x = x;
    }

    public int getY()
    {
        return m_center.y;
    }

    public void setY(int y)
    {
        m_center.y = y;
    }


}
