package Demo;

public class Demo {
	int x;
	int a;
	public Demo() {
	
		System.out.println("Default Constructor : "+x);
	}
	
	public Demo(int x) {
		this.x = x;
		
	}
	
	public Demo(int x,int a) {
		this(x);
		this.a=a;
		
	}
	
	public void show()
	{
		System.out.println("a = "+a);
		System.out.println("x = "+x);
	}
	
	public void Add()
	{
		int res = a+x;
		System.out.println("res = "+res);
	}
	
	
	
	public static void main(String[] args) {
		Demo obj;
	/*obj = new Demo();
	obj.show();
	obj.Add();*/
	obj = new Demo(12,90);
	obj.show();
	obj.Add();
	
	}


}
