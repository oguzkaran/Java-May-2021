/*----------------------------------------------------------------------------------------------------------------------	
	Complex sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		Complex z1, z2;
		Complex result;
		
		z1 = new Complex(3, 4);
		z2 = new Complex(6.7, 9.8);
		
		z1.display();
		z2.display();
		
		result = z1.subtract(z2);
		
		result.display();
		
		result = z1.subtract(3.4);
		
		result.display();
		
		result = Complex.subtract(3.4, z1);
		
		result.display();		
	}
}


class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double real1, double imag1, double real2, double imag2) //İleride bu metodu gizleyeceğiz
	{		
//		Complex result = new Complex(real1 + real2, imag1 + imag2);
//		
//		return result;
		
		return new Complex(real1 + real2, imag1 + imag2);
	}
	
	public static Complex subtract(double real1, double imag1, double real2, double imag2) //İleride bu metodu gizleyeceğiz
	{
		return add(real1, imag1, -real2, -imag2);				
	}
	
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
		return Math.sqrt(real * real + imag * imag);
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
	
	public void display()
	{
		System.out.printf("|%.2f + i%.2f| = %f%n", real, imag, getNorm());		
	}
}



