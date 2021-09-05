/*----------------------------------------------------------------------
	FILE        : Complex.java
	AUTHOR      : Java-May-2021 Group
	LAST UPDATE : 05.09.2021

	Complex class that can be used for Complex numbers

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;


public class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double real1, double imag1, double real2, double imag2) //İleride bu metodu gizleyeceğiz
	{				
		return new Complex(real1 + real2, imag1 + imag2);
	}
	
	public static Complex subtract(double real1, double imag1, double real2, double imag2) //İleride bu metodu gizleyeceğiz
	{
		return add(real1, imag1, -real2, -imag2);				
	}
	
	//...
	
	public Complex()
	{		
	}	
	
	public Complex(Complex other)
	{
		real = other.real;
		imag = other.imag;
	}
	
	public Complex(double re)
	{
		real = re;
	}
	
	public Complex(double re, double im)
	{
		real = re;
		imag = im;
	}
	
	public double getLength()
	{
		return getNorm();
	}
	
	public double getNorm()
	{
		return sqrt(real * real + imag * imag);
	}	
	
	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}
	
	//add	
	public static Complex add(double val, Complex right)
	{
		return add(val, 0, right.real, right.imag);
	}
	
	public Complex add(Complex right)
	{
		return add(real, imag, right.real, right.imag);
	}	
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}
	
	//subtract
	public static Complex subtract(double val, Complex right)
	{
		return subtract(val, 0, right.real, right.imag);
	}
	
	public Complex subtract(Complex right)
	{
		return subtract(real, imag, right.real, right.imag);
	}	
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	//inc
	public void inc(int val)
	{
		real += val;		
	}
	
	public void inc()
	{
		inc(1);		
	}
	
	//dec
	public void dec(int val)
	{
		inc(-val);		
	}
	
	public void dec()
	{
		dec(1);
	}

	public String toString()
	{				
		return String.format("|%.1f%si| = %f", real, (imag < 0 ? " - " : " + ") +  abs(imag), getNorm());		
	}
}
