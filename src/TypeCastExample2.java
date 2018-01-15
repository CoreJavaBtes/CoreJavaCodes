
public class TypeCastExample2 {
	
	public static void main(String[] args) {
		
		int x = 43;
		
		//int to float
		
		float f = x;
	
	/*	boolean bool=false;
		String ss = ""+bool;
		String h = x % 2==0 ?"even":"odd";
	boolean h1 = x >100 ?true:false;
		System.out.println("........."+h);*/
		
		//Explicit Conversion
		
		double d =  98.80d;
		
		int d1 = (int) d;
		
		System.out.println("Value of :: "+d1);
		
	//String to numeric
		
		String s = "7865";
		
		long l = Long.parseLong(s);
		
		long l2 = Long.valueOf(s);
		
		// Numeric to String
		
		long l1 = 87698l;
		
		String s1 = ""+l1;
		
		String s2 = String.valueOf(l1);
		
		String s3 = Long.toString(l1);
		
		//Char to int
		
		char c = 'A';
		int i = c;
		System.out.println("Value is : "+i);
		
		int i1 = 65;
		char c1 = (char)i1;
		System.out.println("...."+c1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
