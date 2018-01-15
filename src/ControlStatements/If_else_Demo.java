package ControlStatements;

import java.util.*; 
public class If_else_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter Any Value :: ");
		
		int i = sn.nextInt();
		
		if(i>50)
		{
			System.out.println("Cleared");
		}else{
			System.out.println("Not Cleared");
		}
	}

}
