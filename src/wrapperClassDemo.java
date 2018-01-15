
public class wrapperClassDemo {

	public static void main(String[] args) {
		
		int i = 1000000000;
		
		Integer i1 = new Integer(1000000000);
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		byte b1 = 19;
		short s1 = b1;
		byte b2 = (byte)s1;
	} 
}
