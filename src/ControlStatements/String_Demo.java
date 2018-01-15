package ControlStatements;

class String_Demo{
	public static void main(String as[])
	{
	/*StringBuffer sb =  new StringBuffer();
	sb.append("5>6=");
	sb.append(5>6);
	System.out.println("Value is = "+ sb);
	*/
	String s1 = "car"; //pool
		String s6 = "car"; //pool
	String s2 = "I have a car , its color is red";
	String s3 = new String("car");  // heap
	String s4 = new String("car");  // heap
	boolean b = s1.equals(s3);
	boolean b1 = s3 == s4;  // comparison with heap & pool then false
	System.out.println("Value is = "+ b1);
	
	String[] arr = s2.split(" ");
	
	for(String s : arr)
	{
	System.out.println("Split is = "+ s);
	}
	
	for(int i = arr.length-1; i>=0; i--)
	{
		System.out.print(arr[i]+" ");
	}/*
	
	String b3 = s2.substring(7,10);
	System.out.println("Substring is = "+ b3);
	s2 = s2.replace("have","has");
	System.out.println("Replaced value is = "+ s2);
	
	char[] c = s1.toCharArray();
	for(char c1 : c)
	{
		System.out.println("char array Value is = "+ c1); 
	}
	//String[] srr = s2.split(" ");
	
	
	
	
	
	
	
	
	
	/*for(String s: srr)
	{
	char c = s.charAt(0);
	String x = ""+c;
	String x1 =x.toUpperCase();
	//System.out.println("Split Value is = "+ x1); 
	String sub = s.substring(1);
	System.out.print(" "+ x1+sub); 
	}*/
	
	
	
	//System.out.println("Value is = "+ b1); 
	}
}