package OOPs;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Len :: "+args.length);
		for(int i =0; i<args.length; i++)
		{
			System.out.println(args[i]+"------- Array");
		}
		
		PolyDemo2 obj =  new PolyDemo2();
		//obj.display(23,"java");
		obj.display(54);
	}

}
