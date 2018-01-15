package Patterns;

public class pattern4 {
	public static void main(String[] args)
	  {
		int i,j,k;
		//char c='a';
		for(i=1;i<9;i++)
		  { int d=97;
			for (j=9;j>i;j--)
			  {
				System.out.print(" ");
			   }
			
			for (j=1;j<i;j++)
			  {
				System.out.print((char)d);
				d++;

			   } d=d-2;
			for (j=1;j<i;j++)
		  {	
				if(d>=97){
				System.out.print((char)d);
				d--;
				}
			   }	
		  	System.out.println("");
		}
	/*	for(i=9;i>0;i--)
		  {	
				
			for (j=9;j>i;j--)
			  {
				System.out.print(" ");
			   }
			for (j=1;j<i;j++)
			  {
				System.out.print("*");
			   }
			for (j=2;j<i;j++)
			  {
				System.out.print("*");
			   }
			
			System.out.println("");

			
		  	
		  	
		  }*/
	  }

}
