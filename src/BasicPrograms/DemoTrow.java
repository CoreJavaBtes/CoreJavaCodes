package BasicPrograms;

public class DemoTrow {
	
	void age(int m) throws CustomException
	{
		if(m>18)
		{
			System.out.println("You can Vote");
		}else
		{
			throw new CustomException("Invalid age");
		}
	}

	public static void main(String[] args) throws CustomException {
		
		DemoTrow obj = new DemoTrow();
		obj.age(13);
	}
}
