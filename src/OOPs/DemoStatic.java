package OOPs;

import static OOPs.dEMOmETHODS.*;
import java.util.Scanner;

import BasicPrograms.DemoScanner;

import static java.lang.Math.*;
public class DemoStatic {
	
	int a = 199;
	  final static double x;
	 static Scanner sn;
	static{
		
		sn = new Scanner(System.in);
		System.out.println("Enter Your Constant");
		x = sn.nextInt();
		
		System.out.println("Your Contant has been declared");
	}
	void show()
	{	
		//x = 100;
		System.out.println("a = "+a);
		System.out.println("x = "+x);
		
		//DemoStaticImport.test();
	}

	public void show1()
	{
		show();
		System.out.println("a = "+a);
		System.out.println("x = "+x);
	}
	public static void display()
	{
		DemoStatic obj = new DemoStatic();
		obj.show1();
		System.out.println(x);
		System.out.println("a = "+obj.a);
		//System.out.println("x = "+x1);
	}
	
	public static void main(String[] args) {
		
		DemoStatic obj = new DemoStatic();
		display();
		test();
		obj.show();
		dEMOmETHODS.test();
	
	}

}


