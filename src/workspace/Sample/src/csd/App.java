package csd;

class App {
	public static void main(String [] args) 
	{	
		double a;
		int b;
		
		a = 5_000_000_000.567;
		
		b = (byte)a;
		
		System.out.printf("(byte)5000000000 = %d%n", (byte)5_000_000_000L);
		System.out.printf("(byte)2147483647 = %d%n", (byte)2147483647);
		System.out.printf("b = %d%n", b);		
	}
}