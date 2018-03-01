package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
	
		hm.put(101, "Manpreet");
		hm.put(102, "Robin");
		hm.put(103, "Manpreet123");
		hm.put(104, "Robin11");
		hm.put(105, "Manpreet77");
		hm.put(106, "Robin88");
		
		System.out.println(hm.get(106));
		
		for(Entry<Integer, String> entry : hm.entrySet()){
			
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("key : "+key+" | value : "+value);
			
		}
			
		ArrayList<String> list = new ArrayList<String>();
	
		ArrayList<String> list1 = new ArrayList<String>();
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Anupam");
		hs.add("Anupam");
		hs.add("Deepika");
		
		list.add("Java");
		list.add("Java");
		list.add("PHP");
		
		list1.add("Amrit");
		list1.add("Deepika");
		list1.add("Yatin");
		
		list.addAll(hs);
		
		Collections.sort(list);
	
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println("...."+list.get(i));
		}
	
		
		for(String s : list){
			System.out.println(s);
		}
		
		
	}

}
