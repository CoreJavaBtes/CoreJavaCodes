package AbstractionDemo;

abstract public class AbsClass {
	
	abstract void area(int x);//Declaration of abstract methods
	abstract void Vol(int  x,int y);
	
	void start(int x, int y)//concrete methods
	{
		x = x/2;
		y = y/2;
		area(x);// Calling of abstract methods
		Vol(x,y);
		System.out.println(".....................");
	}
	

}
