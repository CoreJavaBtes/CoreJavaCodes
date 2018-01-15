package DatabaseDemo;


import java.sql.*;

public class Db_Connections {
	 static Connection con = null;
	  
	    
	    public static Connection db()
	    {
	       try{
	          
	        Class.forName("com.mysql.jdbc.Driver");
	             
	              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test","root","");
	                System.out.println("second::");
	             
	    }catch(Exception e)
	        {
	          System.out.print("exxx"+e);        
	        }
	       return con;
	    }
	    
	   
}
