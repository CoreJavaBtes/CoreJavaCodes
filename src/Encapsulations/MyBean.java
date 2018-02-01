package Encapsulations;

public class MyBean {
	
	public String getName() {
		return name;
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

	private String name;

	public MyBean(String name, int id) {

		this.name = name;
		this.id = id;
	}

	private int id;
	
	
	

}
