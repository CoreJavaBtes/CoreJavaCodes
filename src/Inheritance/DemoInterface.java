package Inheritance;

import OOPs.I1;
import OOPs.I2;

public class DemoInterface  extends Demo1 implements I1,I2{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Declared methods in Interfaces");
		show2();
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Declared methods in Interfaces");
		int var = I1.display(43, 67);
		System.out.println("Result of static method = "+var);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I2.super.show();
		
	}

	
	
}
