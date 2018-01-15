package OOPs;

import static java.lang.Math.*;
public class DemoStaticImport {

	static void test()
	{
		DemoStatic.display();
		System.out.println("hello");
	}

	public static void main(String[] args) {
		
		double d = sqrt(43.8);
		
		System.out.println(".."+d);
	}
	
}
