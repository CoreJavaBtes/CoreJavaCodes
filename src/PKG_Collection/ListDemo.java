package PKG_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class ListDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "Ravi");
		hm.put(102, "Hello");
		
		System.out.println(hm.get(101));
		for(Entry<Integer, String> entry: hm.entrySet()){    
	        int key=entry.getKey();  
	        String b=entry.getValue();  
	      
	        System.out.println(key+" = "+b);  
	         
	    }    
	 
		
	/*	
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("ABC");
		arr.add("XYZ");
		arr.add("Ravi");
		arr.add("Ravi");
		arr.add("Ravi");
		
		ArrayList<String> arr1 = new ArrayList<String>();
		
		arr1.add("hjz");
		arr1.add("bnm");
		
		
		HashSet<String> arr_set = new HashSet<String>();
		arr_set.add("Ravi");
		arr_set.add("Kirti");
		arr_set.add("Ravi");
		arr_set.add("Kirti");
		arr_set.add("Tejas");
		arr_set.add("Kunal");
		
		//
		arr.addAll(arr1);
		Collections.sort(arr);
		
		Iterator itr = arr_set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String s : arr_set)
		{
			System.out.println("Data :: "+s);
		}
		
		for(int i = 0; i<arr_set.size(); i++)
		{
			System.out.println(arr_set.get(i));
		}
*/		
	}

}
