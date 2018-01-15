import java.io.IOException;

public class Try_Catch_Sample {

	
	void m() throws NullPointerException
	{
		
		System.out.println("Throws class");
	}
	
	
	void n()
	{
		m();
	}
	void h() //throws IOException
	{
		n();
	}
	public static void main(String[] args) throws IOException {
		
	Try_Catch_Sample obj = new Try_Catch_Sample();
		obj.h();	
	}
}
