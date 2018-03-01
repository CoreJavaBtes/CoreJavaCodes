package Patterns;

import PackagesDemo.Demo1;

public class Demo3 extends Demo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Len : "+args.length);
		for(String s : args)
		System.out.println(s);
	
		Demo3 obj = new Demo3();
		obj.show3();
		obj.show4();
		double Min=1000;
		double Max = 10000;
		double num =Min + (Math.random() * (Max - Min));
		System.out.println("Random number = "+(int)num);
		/*obj.show4();
		obj.show2();
		obj.show1();*/
		

	}

}
