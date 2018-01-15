package PackagesDemo;

public class Demo1 {
	
	public int x = 100;
	protected int z = 200;
	private void show1()
	{
		System.out.println("Private Method"+x);
	}

	 void show2()
	{
		System.out.println("Default Method"+x);
	}

	public void show3()
	{
		System.out.println("Public Method"+x);
	}

	protected void show4()
	{
		System.out.println("Protected Method"+x);
	}
	
	
	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		obj.show1();
	}

}
