package NestedClasses;

public class DemoStaticNested {
	
	void outerHello()
	{
		System.out.println("My Class1");
	}
	
	 static class InnerDemo{
		int x = 100;
		void innerHello1(){
			DemoStaticNested obj = new DemoStaticNested();
			obj.outerHello();
			System.out.println("My inner class1");
		}
		
		
	}

	 void demoMethod(){
		 System.out.println("DemoMethod");
		 InnerDemo obj = new InnerDemo();//Creating ref of inner class
		 obj.innerHello1();
	 }

	public static void main(String[] args) {
		DemoStaticNested.InnerDemo obj1 = new DemoStaticNested.InnerDemo();
		obj1.innerHello1();
	}
}


