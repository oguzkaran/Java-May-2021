/*----------------------------------------------------------------------------------------------------------------------
	A ile B arasındaki "composition" ilişkisinin genel biri implementasyonu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Car car = new Car(/*...*/);

		car.run();
	}
}

class Car {
	private Engine m_engine;
	//...

	public Car(/*...*/)
	{
		//...
		m_engine = new Engine(/*...*/);
		//..
	}

	public void brake()
	{
		//...
		m_engine.slowEngine();
		//...
	}

	public void run()
	{
		m_engine.startEngine();
		m_engine.accelerateEngine();
		//...
		System.out.println("Running");
		//...
		brake();
		m_engine.stopEngine();
	}
	//....
}

class Engine {
	//...
	public void startEngine()
	{
		System.out.println("Start engine");
	}

	public void accelerateEngine()
	{
		System.out.println("Accelerate engine");
	}

	public void slowEngine()
	{
		System.out.println("Slow engine");
	}

	public void stopEngine()
	{
		System.out.println("Stop engine");
	}

	//...
}
