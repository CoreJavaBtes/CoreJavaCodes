package BasicPrograms;

class A{
	A()
	{
		System.out.println("0");
	}
}
class B extends A{
	B(int a)
	{
		System.out.println("1");
	}
}



public class InheritCheck {
	
	public static void main(String[] args) {
		B obj = new B(3);
		
	}

}
