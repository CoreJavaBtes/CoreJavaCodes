package ControlStatements;

import java.util.Scanner;
public class DemoSwitch {

	public static void main(String[] args) {
		
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any int value");
		int i = sn.nextInt();
		
		System.out.println("Enter any String value");
		String var = sn.next();
		
		System.out.println("Enter any Character value");
		
		char c = sn.next().charAt(0);
		
		System.out.println("Character value :: " + c);
		System.out.println("String value :: " + var);
		System.out.println("int value :: " + i);
		
		
		
	/*	
		switch (var) {
		case "JAVA":
			System.out.println("Valid");
			break;

		case "PHP":
	System.out.println("Valid");
			break;

		case "ANDROID":
	System.out.println("Valid");
	break;

		case "C++":
	System.out.println("Valid");
	break;

	
		default:
			System.out.println("InValid");
			break;
		}*/
	}
}
