package AbstractionDemo;

public class DemoAbs1 extends AbsClass{
	int x;
	public DemoAbs1(int x) {
		this.x = x;
		start(x,0);
	}

	@Override
	void area(int x) {
		// TODO Auto-generated method stub
		
		double res = x*x;
		System.out.println("My Result is :: "+res);
		
	}

	@Override
	void Vol(int x,int y) {
		// TODO Auto-generated method stub
		
	}



	
	
	

}
