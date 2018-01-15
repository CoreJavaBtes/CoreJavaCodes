package FileHandling;

import java.io.*;

public class DemoDeserialize {

	public static void main(String[] args) {
		
	
	 Employee e = null;
     try
     {
        FileInputStream fileIn = new FileInputStream("D:/MyEmployee.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        e = (Employee) in.readObject();
        in.close();
        fileIn.close();
     }catch(IOException i)
     {
      //  i.printStackTrace();
        return;
     }catch(ClassNotFoundException c)
     {
        System.out.println("Employee class not found");
      //  c.printStackTrace();
        return;
     }
     System.out.println("Deserialized Employee...");
     System.out.println("Name: " + e.getName());
     System.out.println("id: " + e.getId());
  
	}
}
