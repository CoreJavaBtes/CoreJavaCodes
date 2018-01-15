package DatabaseDemo;

import java.util.Scanner;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBSample {
	 java.sql.Connection con;
	 
	public DBSample() {
		// TODO Auto-generated constructor stub
		 
		 con = Db_Connections.db();
	}
	
	void insert(String name, String contact, String email, String pass)
	{
	  
	       
        try {
     PreparedStatement pd = con.prepareStatement("Insert into tb_reg (tb_name,tb_contact,tb_email,tb_pass) values(?,?,?,?) ");
      
         
          //  pd.setInt(1,0 );  
            pd.setString(1, name);
                pd.setString(2, contact);
                 
                    pd.setString(3, email);
                       pd.setString(4, pass);
                    
                     
                       
                          
                          int i = pd.executeUpdate();
                          
                          if(i>0)
                          {
                              System.out.println("Successfully Inserted");
                             // response.sendRedirect("/Login.html");
                          }	
        }catch(Exception e)
        {
        	System.out.println(e);
        }
	}
	
	void select(String uname, String pass)
	{
		try {
            PreparedStatement pd = con.prepareStatement("select * from tb_test where email = '"+uname+"' "
            														+ "and password = '"+pass+"' ");
            ResultSet rs = pd.executeQuery();
            
            while (rs.next()) {
				String nn = rs.getString(2);
				String em = rs.getString(3);
				String pas = rs.getString(4);
				String cont = rs.getString(5);
				String ad = rs.getString(6);
				
				System.out.println("Values Are::"+nn);
				
			}
            
           /* if (rs.next()) {
				System.out.println("You are Successfully LogIn");
			}else{
				System.out.println("Your Username or password are incorrect");
			}*/
            
		}catch(Exception e)
		{
			System.out.println(""+e);
		}
		
	}

	public static void main(String[] args) {
		
		
	
		Scanner sn = new Scanner(System.in);
		
		System.out.println("1. Registration");
		System.out.println("2. Login");
		System.out.println("Enter Your choice ::");
		
		DBSample obj = new DBSample();
		
		int choice = sn.nextInt();
		 switch (choice) {
		case 1:
			System.out.println("Enter you name ::");
			String name = sn.nextLine();
			
			System.out.println("Enter you Email ::");
			String email = sn.nextLine();
			
			System.out.println("Enter you Contact ::");
			String cont = sn.nextLine();
			
			System.out.println("Enter you Password ::");
			String pass = sn.nextLine();
			
		
			
			obj.insert(name, cont, email, pass);
			break;
			
		case 2:
			System.out.println("Enter you Email ::");
			
			String uname = sn.next();
			System.out.println("  ");
			
			System.out.println("Enter you Password ::");
			String pass1 = sn.next();
			
			obj.select(uname, pass1);
			break;
		default:
			break;
		}
		
		
		
		
		
	}
}
