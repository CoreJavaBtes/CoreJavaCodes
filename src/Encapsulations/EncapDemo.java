package Encapsulations;

public class EncapDemo {

	public static void main(String[] args) {

		MyBean obj = new MyBean();
		obj.setXyz(67.09f);
		obj.setId(101);
		obj.setName("Sipika");

		MyBean obj1 = new MyBean();

		obj1.setId(102);
		obj1.setName("Saini");
		obj1.setXyz(43.9f);

		// System.out.println(obj.getName());

		System.out.println(obj1.getName());
		System.out.println(obj.getId());

		
		 new GetEncap(obj1); 
		 new GetEncap(obj);
		 
	}

}
