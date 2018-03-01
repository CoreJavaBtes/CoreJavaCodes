package OOPs;

public class InterfaceDemo implements I1,I2{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display "+x);
		int res = I1.display(10, 80);
		System.out.println("///////"+res);
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Show1 "+ i);
		int x = I1.display(120,50);
		System.out.println(".........."+x);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I1.super.show();
	}

	

	/*public void show1()
	{
		System.out.println("Show1 "+ i);
		int x = I1.display(120,50);
		System.out.println(".........."+x);
		
	}
	
	public void display()
	{
		System.out.println("display "+x);
		int res = I1.display(10, 80);
		System.out.println("///////"+res);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I1.super.show();
		
	}*/

}
