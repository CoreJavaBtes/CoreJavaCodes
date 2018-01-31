package BasicPrograms;

public class demoTest {
	public static void main(String[] args) {
		
		for(int r=1; r<=5; r++)
		{
			for(int c = 1; c<=r; ++c)
			{
				System.out.print("*");
			}
			System.out.println("");
			if(r==3)
			{
				break;
			}
		}
	}

}
