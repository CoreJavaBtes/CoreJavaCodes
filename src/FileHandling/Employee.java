package FileHandling;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private transient int id;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private String name;
	
	public Employee(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	
	
	
	

}
