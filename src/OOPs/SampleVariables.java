package OOPs;

public class SampleVariables {
	
	int a = 10;   // Global Var
	static int x =100;  // static var
	
	void show()
	{
		int h = 20; // Local var
	
		System.out.println("local :: "+h);
		System.out.println("Global :: "+a);
		System.out.println("Static :: "+x);
		
		a++;
		x++;
		
	}
	
	
	public static void main(String[] args) {
		
		SampleVariables obj = new SampleVariables();   // Instance Var
		obj.show();
		System.out.println("Global :: "+obj.a);
		System.out.println("static :: "+x);
		DemoStatic.display();
		SampleVariables obj1 = new SampleVariables();
		
		obj1.show();
	}

}
