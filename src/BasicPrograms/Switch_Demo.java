package BasicPrograms;
import java.util.Scanner;

public class Switch_Demo {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		double res = 0;
		System.out.println("Enter num1");
		int num1 = sn.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sn.nextInt();
		
		System.out.println("Enter + for Addition");
		System.out.println("Enter - for Subtraction");
		System.out.println("Enter / for Division");
		System.out.println("Enter * for Multiplication");
		
		char c = sn.next().charAt(0);
		
		String symbol = sn.next();
		switch (symbol) {
		
		case "*":
			 res = num1*num2;
			
			break;
		case "+":
			res = num1+num2;
			break;
		case "-":
			res = num1-num2;
		break;	
			
		case "/":
			res = num1/num2;
			break;
		default:
			System.out.println("wrong input");
			break;
		
		
		}
		System.out.println("Result = "+res);
	}
}
