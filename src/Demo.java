import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int h  = sn.nextInt();
		for(int i = 10; i > 0 ; i--)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println("Value is :: "+i);
		}
	}

}
