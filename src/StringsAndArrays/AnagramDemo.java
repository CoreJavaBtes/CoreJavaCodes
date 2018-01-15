package StringsAndArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramDemo {
	
	public static void main(String[] args) {
		
		String s ="Silent";
		String s1 = "listen";
		
		char[] c = s.toLowerCase().toCharArray();
		char[] c1 = s1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c);
		boolean flag = true;
		if(s.length()==s1.length()){
		for(int i=0 ; i<c.length; i++)
		{
			if(c[i]==c1[i])
			{
				flag = false;
			}else{
				flag = true;
				break;
			}
		}
		}
		if(flag == false)
		{
			System.out.println("Anagram");
		}else{
			System.out.println("Not");
		}
	}

}
