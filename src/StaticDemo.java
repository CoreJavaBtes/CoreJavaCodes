
public class StaticDemo {
	
	static int x;
	static int a ;
	
	static {
		x=200;
		System.out.println("Static Block"+x);
	}
	
	void sub()
	{
		a=200;
		System.out.println(a);
	}
	
	public static void sum()
	{
		
		int res = x+a;
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		
		
		sum();
		
	}

}
