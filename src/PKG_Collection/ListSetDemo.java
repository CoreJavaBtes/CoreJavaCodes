package PKG_Collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class ListSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> arr = new HashSet<String>();
		Vector<Integer> vec = new Vector<Integer>();
		
		System.out.println("....."+vec.capacity());
		for(int i = 0; i<13; i++){
		vec.add(13);
		}
		System.out.println("...22.."+vec.capacity());
		arr.add("ABC");
		arr.add("XYZ");
		arr.add("Ravi");
		arr.add("Ravi");
		arr.add("Ravi");
		
		HashSet<String> arr1 = new HashSet<String>();
		
		arr1.add("hjz");
		arr1.add("bnm");
		
		arr.addAll(arr1);
		
		for(String s: arr)
		{
			System.out.println(s);
		}
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
