package CollectionProject;

public class Bean implements Comparable{
	
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	int id;
	public Bean(int id, int age, String name) {
		
		this.id = id;
		this.age = age;
		this.name = name;
	}

	int age;
	String name;
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Bean b = (Bean) arg0;
		if(age<b.age)
		{
			return 1;
		}else if(age == b.age)
		{
			return 0;
		}else{
			return -1;
		}
		
		/* For String Comparison
		 * 
		 * Bean b = (Bean) arg0;	
		
		return name.compareTo(b.name);*/
	}
	


	
		
	


}
