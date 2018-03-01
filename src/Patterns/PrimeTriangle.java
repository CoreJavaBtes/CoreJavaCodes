package Patterns;

public class PrimeTriangle {
	
	public static void main(String[] args) {
		
		
		boolean flag1;
		/*for(int i=1;i<=10;i++)
		{   int count=0;  
		   //
*/		    for(int k=1;k<=25;k++)
		    {
		        flag1=true;
		        for(int j=2;j<=k/2;j++)
		        {
		            if(k%j==0)
		            {
		                flag1=false; //non-prime
		                break;
		            }
		        }
		            if((flag1==true)/* && (count<i)*/)
		            {
		                System.out.println(k);
		                //count++;
		            }
		    }
		   System.out.println();
		   
		   
		//}

	}

}
