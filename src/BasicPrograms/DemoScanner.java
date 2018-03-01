package BasicPrograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Scanner sn = new Scanner(System.in);
		System.out.println("Enter a word");
		String s1 = sn.next();
		System.out.println("Enter a string");
		String s2 = sn.nextLine();
		System.out.println("My Data is :: "+s1);
		System.out.println("My Data is :: "+s2);
		*/System.out.println("Enter a string");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String s3 = br.readLine();
		int i = Integer.parseInt(s3);
		
		System.out.println("String is :: "+i);

	}
}
