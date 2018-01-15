package OOPs;

public interface I2 {

	int x = 100;
	void display();
	void show1();
	
	public default void show()
	{
	System.out.println("Hello default I2");	
	}
}
