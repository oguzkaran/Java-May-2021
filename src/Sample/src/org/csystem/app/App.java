/*----------------------------------------------------------------------------------------------------------------------
	String sınıfı immutable olduğundan aşağıdaki ilişki ne aggregation, ne de composition'dır. İkisine de belirli
	ölçüde yakın olsa da tam olarak uymamaktadır. Bu özel bir durumdur ve ilişkileri etkilemez. Bu ilişkiye isim
	verilmesi de gerekmez
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String name = "Weather sensor";
		String host = "192.167.1.4";
		int port = 50500;

		Device device = new Device(name, host, port);
		System.out.println(device.toString());
		name = name.toUpperCase();
		System.out.println(name);
		System.out.println(device.toString());
	}
}

class Device {
	private String m_name;
	private String m_host;
	private int m_port;

	public Device(String name, String host, int port)
	{
		//...
		m_name = name;
		m_host = host;
		m_port = port;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public String getHost()
	{
		return m_host;
	}

	public void setHost(String host)
	{
		m_host = host;
	}

	public int getPort()
	{
		return m_port;
	}

	public void setPort(int port)
	{
		m_port = port;
	}

	//...
	public String toString()
	{
		return String.format("%s, %s:%d", m_name, m_host, m_port);
	}
}

