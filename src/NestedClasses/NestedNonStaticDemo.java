package NestedClasses;

import NestedClasses.DemoStaticNested.InnerDemo;

public class NestedNonStaticDemo {
	
	void outerHello()
	{
		System.out.println("My Class1");
	}
	
	 class InnerDemo{
		int x = 100;
		void innerHello1(){
			//DemoStaticNested obj = new DemoStaticNested();
			outerHello();
			System.out.println("My inner class1");
		}
		
		
	}

	 void demoMethod(){
		 System.out.println("DemoMethod");
		 InnerDemo obj = new InnerDemo();//Creating ref of inner class
		 obj.innerHello1();
	 }

	public static void main(String[] args) {
	//	DemoStaticNested.demo1 obj1 = new DemoStaticNested.demo1();
		NestedNonStaticDemo obj = new NestedNonStaticDemo();//Creating ref of outer class
		InnerDemo obj1 = obj.new InnerDemo();//Creating ref of inner class
		obj.demoMethod();
		obj1.innerHello1();
	}
}
