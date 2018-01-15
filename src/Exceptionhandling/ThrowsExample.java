package Exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExample {

	
	void m(int no) throws CustomException{
		
	System.out.println("My Exception");
		if(no<30)
	{
		throw new CustomException("InvalidDataException");
	}else{
		System.out.println("All Right");
	}
		
	}
	
	void n() throws CustomException 
	{
		
			m(10);
		
	}
	
	void g() throws CustomException
	{
	n();
	}
	public static void main(String[] args) throws CustomException  
	{
		ThrowsExample obj = new ThrowsExample();
		
		
		obj.g();
	}
}












