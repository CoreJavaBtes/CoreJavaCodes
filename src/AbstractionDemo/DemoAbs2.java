package AbstractionDemo;

public class DemoAbs2 extends AbsClass{
double x;
public DemoAbs2(double x) {
	// TODO Auto-generated constructor stub
	this.x = x;
}

	@Override
	void area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void Vol() {
		// TODO Auto-generated method stub
		double res = 4/3*x*x*x;
		System.out.println("Vol of Circle is = "+res);
	}
	
	void hello(){
		
	}

}
