package ControlStatements;

public class String_Reverse {
	public static void main(String[] args) {
		
		String s = "welcome to india";
		
		String[] arrr = s.split(" ");
		
		for(int i = arrr.length-1 ; i>=0; i--)
		{
			String s1 = arrr[i].substring(0,1);
			String s2 = s1.toUpperCase();
			System.out.print(s2+arrr[i].substring(1)+" ");
		}
	}
	

}
