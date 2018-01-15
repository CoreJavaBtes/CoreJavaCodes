package AbstractionDemo;

abstract public class AbsClass {
	
	abstract void area();//Declaration of abstract methods
	abstract void Vol();
	
	void start()//concrete methods
	{
		area();// Calling of abstract methods
		Vol();
		System.out.println("Non-Abstract Method");
	}
	

}
