package Exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExample {

	
	void m() throws CustomException{
		
	System.out.println("My First Method");
	throw new CustomException("Anything");
		
	}
	
	void n() 
	{
		
			try {
				m();
			} catch (CustomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	void g()  
	{
	n();
	}
	
	public static void main(String[] args)  {
		ThrowsExample obj = new ThrowsExample();
		obj.g();
	}
}












