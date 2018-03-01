package AbstractionDemo;

public class DemoAbs2 extends AbsClass{
double x,y;

public DemoAbs2(int x,int y) {
	// TODO Auto-generated constructor stub
	this.x = x;
	this.y = y;
	start(x,y);
	
}
@Override
void area(int x) {
	// TODO Auto-generated method stub
	
}
@Override
void Vol(int x,int y) {
	// TODO Auto-generated method stub
	
	double vol = x*y;
	System.out.println("Volume is :: "+vol);
	
}

	
	


}
