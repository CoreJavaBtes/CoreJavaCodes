package Inheritance;

public class Student3 extends Student2{

	int atndc,sports;
	public Student3(int id, String name, String std, double m1, double m2, double m3, int atndc, int sports) {
		super(id, name, std, m1, m2, m3);
		// TODO Auto-generated constructor stub
		this.atndc = atndc;
		this.sports = sports;
	}
	
	double result()
	{
		double res = atndc+sports+cal();
		return res;
	}

	
	
	void putdata()
	{
		display1();
		System.out.println("Marks1 = "+m1);
		System.out.println("Marks2 = "+m2);
		System.out.println("Marks3 = "+m3);
		
		System.out.println("Average %age = "+result());
	}

	

}
