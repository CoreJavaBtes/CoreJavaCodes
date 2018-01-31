package BasicPrograms;
import java.util.Scanner;

public class Shortest_Palindrome {

	public static void main(String[] args) {
		
		
		  Scanner s=new Scanner(System.in);
	        System.out.print("Enter the string: ");
	        String s1=s.nextLine();
	        int count=0;
	        String[] s2=s1.split(" ");
	        System.out.println(s2.length);
	        int i=s2.length;
	        String s4="";
	        for(int j=0;j<s2.length;j++)
	        {
	            String s3=s2[j];
	            char[] c=s3.toCharArray();
	            for(int k=c.length-1;k>=0;k--)
	            {
	                s4+=Character.toString(c[k]);
	            }
	            if(s4.equalsIgnoreCase(s3))
	            {
	                count++;
	                if(s4.length()<i)
	                {
	                i=j;
	                }
	            }
	            s4="";
	        }
	        if(count>0)
	        {
	            System.out.println("shortest palindrome is: "+ s2[i]);
	        }
	        else
	        {
	            System.out.println("no shortest palindrome is there");
	        }

	}

}
