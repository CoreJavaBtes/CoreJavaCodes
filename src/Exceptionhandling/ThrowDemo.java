package Exceptionhandling;

public class ThrowDemo {
	
	void age(int a) throws CustomException
	{
		if(a>18)
		{
			System.out.println("You can Vote");
		}else{
			throw new CustomException("InValidDataException");
			//throw new CustomException("NotValidException");
		}
	}
	
	public static void main(String[] args) throws CustomException {
		ThrowDemo obj = new ThrowDemo();
		obj.age(12);
	}

}
