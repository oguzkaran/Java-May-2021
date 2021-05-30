/*----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı double türden x1, y1, x2, y2 koordinat bilgilerine göre iki nokta
	arasındaki  ((x1, y1) ve (x2, y2)) uzaklığa geri dönen distance isimli metodu PointUtil isimli sınıf içerisinde 
	yazınız	ve klavyeden girilen değerlerle çağırarak test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		DistanceTest.run();		
	}
}

class DistanceTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("x1?:");
		double x1 = Double.parseDouble(kb.nextLine());
		
		System.out.print("y1?:");
		double y1 = Double.parseDouble(kb.nextLine());
		
		System.out.print("x2?:");
		double x2 = Double.parseDouble(kb.nextLine());
		
		System.out.print("y2?:");
		double y2 = Double.parseDouble(kb.nextLine());
		
		System.out.printf("Distance:%f%n", PointUtil.distance(x1, y1, x2, y2));		
	}
}

class PointUtil {
	public static double distance(double x1, double y1, double x2, double y2)
	{		
		double diffX = x1 - x2;
		double diffY = y1 - y2;
		
		return Math.sqrt(diffX * diffX + diffY * diffY);		
	}
}
