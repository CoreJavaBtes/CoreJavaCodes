package Patterns;

public class Alphabet_Triangle {
	
	public static void main(String[] args) {
		
		 int i , j , k ,p;
		 char s ;
		  for ( i = 0 ; i<=3 ; i++)
		    { for(j = 2 ; j>=i ; j--)
		      {
		         System.out.print(" ");
		       }
		      for( k= 0 ; k<= i ; k++)
		        {    
		            p = 97 + k ;
		        // s = (char)p ;
		 System.out.print(p);


		 }
		 for( k=i-1; k>=0 ; k--)
		        {    
		            p = 1 + k  ;
		     //   s = (char)p ;
		 System.out.print(p);
		 }
		 System.out.println();


		 }


	
	}

}
