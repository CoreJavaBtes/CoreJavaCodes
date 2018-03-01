package OOPs;

public class DemoEncapsulation {
	
	public static void main(String[] args) {
		
		
	BeanClass obj = new BeanClass();

	BeanClass obj1 = new BeanClass();
		
	obj.setColor("RED");
	obj.setName("ABC");
	
	obj1.setColor("Blue");
	obj1.setName("XYZ");
	
	System.out.println(obj.getColor());
	System.out.println(obj1.getName());
	
	}

}
