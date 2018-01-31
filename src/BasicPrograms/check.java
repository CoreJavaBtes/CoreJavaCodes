package BasicPrograms;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class check {
public static void main(String[] args) {
	
	Scanner sn=new Scanner(System.in);
	System.out.println("Enter the Starting of series");
	int start=sn.nextInt();
	System.out.println("Enter the Ending of series");
	int end=sn.nextInt();
	int i,j,n;
	for(n=start;n<=end;n++)
	{
		for(i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
			System.out.println(n);
	}
	
	
}
}
