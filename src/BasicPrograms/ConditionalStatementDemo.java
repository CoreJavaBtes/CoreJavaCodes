package BasicPrograms;

import java.util.Scanner;

public class ConditionalStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		
		int a = sn.nextInt();
		int b = sn.nextInt();
		
		if(a>b){
			System.out.println("a is greater="+a);
		}else if(a==b){
			System.out.println("a == b "+a);
		}else{
			System.out.println("b is greater="+b);
		}
	
	}

}
