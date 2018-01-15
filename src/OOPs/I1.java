package OOPs;

public interface I1 {

	int i = 10;
	void show1();
	
	public default void show()
	{
	System.out.println("Hello default I1");	
	}

	public static int display(int a, int b)
	{
		return a+b;
	}
}
