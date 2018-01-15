package Demo;

public class ShortestPalindrom {

	public static void main(String[] args) {
		String s = "madam like pop music";
		
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j = s1[i].length()-1;j>=0;j--)
				{
				
				String s2="";
				s2 = s2+""+s1[i].charAt(j);
				System.out.println(s2);
		
			}
		}
	}
}
