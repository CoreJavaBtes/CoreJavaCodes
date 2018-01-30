package OutputOreintedPrograms;

public class Statements {
	
	public static void main(String[] args) {
		
	/*	//Problem-1
		  int var1 = 5; 
          int var2 = 6;
          if ((var2 = 1) == var1)
              System.out.print("=======  "+var2);
          else 
              System.out.print("=====  "+ ++var2);
          */
          //Problem-2
        /*  int sum = 0;
          for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
              sum += i;
	     System.out.println(sum);*/
	     
	     //Problem-3
	  /*   int x = 2;
         int y = 0;
         for ( ; y < 10; ++y) 
         {
             if (y % x == 0) 
                 continue;  
             else if (y == 8)
                  break;
             else
                System.out.print(y + " ");
         }*/
         
         //Problem-4
         
       /*   int a=10,b=20;
         while(a<b)
         {

         System.out.println("Hello");
         a++;
         }  System.out.println("World");
         */
         //Problem-5
         
        /* int a = 5;
         int b = 10;
         first: 
         {
            second: 
            {
               third: 
               { 
                   if (a ==  b >> 1)
                       break second;
               }
               System.out.println(a);
            }
            System.out.println(b);
         }
         */
         //Problem-6
         int a=-3;
         
         if(a<=0)
         {
            if(a==0)
            {
              System.out.println("1 ");
            }
            else 
            { 
               System.out.println("2 ");
            }
         }
         System.out.println("3 ");
	}

}
