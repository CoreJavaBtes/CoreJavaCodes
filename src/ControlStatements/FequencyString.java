package ControlStatements;

public class FequencyString {
	public static void main(String[] args) {
		
		String s = "I have a Cat gh gh gh";
		char c = 0;
		int count = 0;
		char[] arr = s.toLowerCase().toCharArray();
		
		
		/*String s1 = "Cat";
		char[] arr1 = s1.toLowerCase().toCharArray();
		*/
		for(int i = 0; i<arr.length; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					c = arr[i];
					count++;
					
				}
			}
			
		}
		System.out.print("character "+c+" happens "+count+" times"  );
		
	}

}
