package FileHandling;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

	public class CopyFile {
	  
		public static void main(String args[]) throws IOException
	   {
			
			System.out.println(args[0]);
			Scanner sn = new Scanner(System.in);
	      FileInputStream in = null;
	      
	      FileOutputStream out = null;
	      System.out.println("Enter word");
	      String s = sn.nextLine();
	      char[] ch = s.toCharArray();
	      try {
	         in = new FileInputStream("D:/output.txt");
	         out = new FileOutputStream("D:/Sample1.txt");
	         
	     /*    for(int i=0; i<=al.size();i++)
	         {
	        	 out.write(56);
	         }*/
	         
	         int c=in.read();
	         for(int i = 0; i<ch.length; i++){
	         while (c  != -1) {
	        	 if(ch[i]==(char)c){
	            out.write(c);
	            System.out.print((char)c);
	            break;
	        	 }
	        	 c=in.read();
	         }
	         }
	      }finally {
	         if (in == null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	}


