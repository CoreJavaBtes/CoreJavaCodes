
import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Please Enter any Number :: ");
		
		int a = obj.nextInt();
		System.out.println("Please Enter any String :: ");
		
		String s = obj.next();
		System.out.println("Please Enter any Character :: ");
		
		char c = obj.next().charAt(0);
		
		System.out.println(" Character :: "+c);
		
	}

}
