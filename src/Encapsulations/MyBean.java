package Encapsulations;

public class MyBean {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public MyBean(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
	
	
	

}
