package OOPs;

public class CustructorDemo {

	double a, b;

	public CustructorDemo() {
		// this(5.7);
		System.out.println("I Am Default Constructor");
	}

	public CustructorDemo(double a) {
		this();
		System.out.println("Constructor 1");

		this.a = a;

		System.out.println("Constructor 1 :: " + a);
	}

	public CustructorDemo(double a, double b) {
		this(a);
		System.out.println("Constructor 2");
		this.a = a;
		this.b = b;

	}

	void show() {
		System.out.println("Value ::" + a);
		System.out.println("Value ::" + b);
	}

	public static void main(String[] args) {

		/*
		 * CustructorDemo obj = new CustructorDemo(); obj.show();
		 * 
		 * CustructorDemo obj1 = new CustructorDemo(3.7); obj1.show();
		 */

		CustructorDemo obj2 = new CustructorDemo(3.7, 65.8);
		obj2.show();

	}

}
