package Patterns;



public class NumTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l;
		   for(i=1;i<6;i++)
		   {
			   for(j=5;j>i;j--)
				{
				  System.out.print(" "); 
				}	
				 for(k=1;k<i;k++)
				{
				  System.out.print(k); 
				}	
				 for(l=i;l>=1;l--)
				{
				  System.out.print(l); 
				}	
			 System.out.println(); 
		    }
	
	}
	

}
