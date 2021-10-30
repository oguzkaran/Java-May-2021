/*----------------------------------------------------------------------------------------------------------------------
	Taxi, Driver ve Client sınıfları ve aralarındaki ilişkiler
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Taxi taxi = new Taxi(DriverUtil.getDriver()/*...*/);
		Client client = ClientUtil.getClient();

		taxi.takeClient(client);
		//...
	}
}

class DriverUtil {
	public static Driver getDriver()
	{
		Driver driver = new Driver();

		driver.setName("Oğuz Karan");
		driver.setDriverLicenceNo(12345678);

		return driver;
	}
}

class ClientUtil {
	public static Client getClient()
	{
		Client client = new Client();

		client.setName("Çağıl Cebeci");
		client.setUsername("ccebeci");

		return client;
	}
}

class Taxi {
	private Driver m_driver;
	//...
	public Taxi(Driver driver)
	{
		m_driver = driver;
	}

	public Driver getDriver()
	{
		return m_driver;
	}

	public void setDriver(Driver driver)
	{
		//...
		m_driver = driver;
	}

	//...
	public void takeClient(Client client)
	{
		System.out.printf("Client Info:%s, %s%n",  client.getName(), client.getUsername());
		System.out.printf("Driver Info:%s, %d%n", m_driver.getName(), m_driver.getDriverLicenceNo());
	}
}

class Client {
	private String m_username;
	private String m_name;

	//...
	public String getUsername()
	{
		return m_username;
	}

	public void setUsername(String username)
	{
		m_username = username;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}
}

class Driver {
	private String m_name;
	private long m_driverLicenceNo;
	//...

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public long getDriverLicenceNo()
	{
		return m_driverLicenceNo;
	}

	public void setDriverLicenceNo(long driverLicenceNo)
	{
		m_driverLicenceNo = driverLicenceNo;
	}
}
