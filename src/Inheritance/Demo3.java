package Inheritance;

public class Demo3 extends Demo2 {
	String name;
	public Demo3(int x, int y , String name)
	{
		super(x,y);
		this.name=name;
		
	}
	
	public void show3()
	{
		show2();
	}

}
