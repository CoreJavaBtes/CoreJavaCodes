package Exceptionhandling;

public class ExceptionDemo {
	
	
	public static void main(String[] args) {
		
		try {
			int res = 34/0;
		}catch(ArithmeticException e){
			System.out.println("Exception :: "+e);
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("finally block");
		}
		
		
	}

}
