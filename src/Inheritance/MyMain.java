package Inheritance;

import java.util.Scanner;

public class MyMain {
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Please Enter 2 values");
		int a = sn.nextInt();
		int b = sn.nextInt();
		
		Demo3 obj = new Demo3(a,b,"java");
		
		obj.show2();
		obj.show1();
		obj.show3();
	}

}
