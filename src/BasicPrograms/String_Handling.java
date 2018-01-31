package BasicPrograms;

public class String_Handling {
	
	public static void main(String[] args) {
		
		String s = "I have a car";
		String s2 = " Its color is white";
		String s4= "i am in btes";
		String s3 = s+s2;
	/*	
		StringBuffer sb = new StringBuffer("This is computer");
		
		System.out.println("Reverse a string Buffer ::");
		System.out.println(sb.reverse());
		
		System.out.println("");*/
		
		/*System.out.println("...."+s3);
		System.out.println("Index of a :: "+s.indexOf('a'));
		
		//System.out.println("Concatination :: "+s3);
		
		String s4 = s.substring(3,9);
		System.out.println("Substring :: "+s4);*/
		
		String srr1[] = s4.split(" ");
		System.out.print(srr1[srr1.length-1].toUpperCase());
		for(int i = srr1.length-2; i>=0; i--)
		{	
			System.out.print(" "+srr1[i].substring(0, 1).toUpperCase()+srr1[i].substring(1));
		}
		
		
		
	/*	String[] srr = s3.split(" ");
		
		System.out.println("");
	
		for(int i=srr.length-1; i>=0; i--){
			System.out.print(" "+srr[i]);
			
		//System.out.println("Index : "+i+"  Value :: "+srr[i]+" ");
		}
		System.out.println("");
		
			System.out.println("toCharArray Usage");
		char[] c = s2.toCharArray();
		
		for(int i=c.length-1; i>=0; i--){
			System.out.println("Index : "+i+"  Value :: "+c[i]+"");
			}*/
	
		//StaticDemo.sum();
	
	}

}
