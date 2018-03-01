package Inheritance;

public class Demo2 extends Demo1{
	int s;
	
	public Demo2(int x,int y){
		super(x);
		s = y;
	}
	
	void show1()
	{
		System.out.println("X = "+x);
		System.out.println("y = "+s);
		show2();
	}

}
