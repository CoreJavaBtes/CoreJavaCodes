package Inheritance;

public class Student1 {
	
	int id;
	String name,std;
	final static int x = 100;
	public Student1(int id, String name, String std) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.std = std;
		
	}
	
 void display()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Class = "+std);
	}

}
