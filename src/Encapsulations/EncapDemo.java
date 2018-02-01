package Encapsulations;

public class EncapDemo {

	public static void main(String[] args) {

		MyBean obj = new MyBean("Sipika",123);

		/*obj.setId(123);
		obj.setName("XYZ");*/

		MyBean obj1 = new MyBean("Saini",234);

		/*obj1.setId(345);
		obj1.setName("ABC");*/
		
		
		System.out.println(obj.getId());
		System.out.println(obj1.getName());
		
		new GetEncap(obj1);
		new GetEncap(obj);


	}

}
