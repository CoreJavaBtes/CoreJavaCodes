package OOPs;

public class CustructorDemo {

	double x, b;
	
	public CustructorDemo(int b) {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
		this.b = b;
		
	}
	
	public CustructorDemo(int x,int b) {
		// TODO Auto-generated constructor stub
		this(b);
		this.x = x;
	}
	

	void show()
	{
		System.out.println(x);
		System.out.println(b);
	}


	public static void main(String[] args) {

	
		  
		  CustructorDemo obj1 = new CustructorDemo(3,8); 
		  obj1.show();
		 

	
	}

}
