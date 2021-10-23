/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki probleme ilişkin sınıflar Java 5 ile eklenen ve detayları ileride açıklanan "enum sınıflar (enum classes)"
	kullanılarak daha yalın hale getirilebilir. Üstelik enum class'lar yukarıdaki sınıflardan daha fazla yetenek de
	kazandırır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		AlienGame alienGame = new AlienGame();

		alienGame.run();
	}
}

class AlienGame {
	//...
	public void run()
	{
		GameObject gameObject = new GameObject(/*...*/);

		//...

		gameObject.setColor(Color.RED);
		gameObject.setColor(Color.GREEN);
		gameObject.setColor(Color.BLUE);
		gameObject.setColor(Color.WHITE);
		gameObject.setColor(Color.BLACK);
	}
}

enum Direction {
	RIGHT, TOP, LEFT, BOTTOM
}

enum Color {
	RED, GREEN, BLUE, WHITE, BLACK
}

class GameObject {
	private Color m_color;
	//...
	public void setColor(Color color)
	{
		//...
		m_color = color;
	}

	public void move(Direction direction)
	{
		//...
	}

	//...
}

