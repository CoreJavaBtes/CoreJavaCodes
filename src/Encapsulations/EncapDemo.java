package Encapsulations;

public class EncapDemo {

	public static void main(String[] args) {

		MyBean obj = new MyBean("XYZ",123);

	/*	obj.setId(123);
		obj.setName("XYZ");*/

		MyBean obj1 = new MyBean("ABC",456);

		/*obj1.setId(345);
		obj1.setName("ABC");*/
		
		
		new GetEncap(obj);
		new GetEncap(obj1);


	}

}
