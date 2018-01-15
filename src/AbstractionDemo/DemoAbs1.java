package AbstractionDemo;

public class DemoAbs1 extends AbsClass{

	double x;
	public DemoAbs1(double x) {
		// TODO Auto-generated constructor stub
		this.x = x;
		start();
	}
	@Override
	void area() {
		// TODO Auto-generated method stub
		double res = x*x;
		System.out.println("Area is ::"+res);
		
	}
	@Override
	void Vol() {
		// TODO Auto-generated method stub
		
	}
	

	
	
	

}
