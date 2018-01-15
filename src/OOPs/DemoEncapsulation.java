package OOPs;

public class DemoEncapsulation {
	
	public static void main(String[] args) {
		
		
		
		BeanClass obj = new BeanClass(101, "Yatin", "Black");
		
		BeanClass obj1 = new BeanClass(102, "Anurag", "Red");
		BeanClass obj2 = new BeanClass(103, "Anuraghg", "Rdfged");
		BeanClass obj3 = new BeanClass(100, "Anurfgag", "Rgfded");
		
		BeanClass[] arr = {obj , obj1, obj2, obj3};
		
		for(int i = 0 ; i<arr.length; i++)
		{
			System.out.println("id = "+ arr[i].getId());
			System.out.println("Name = "+ arr[i].getName());
			System.out.println("Color = "+ arr[i].getColor());
			System.out.println(" ");
			
		}
		
		
		
	}

}
