package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {
		
		ArrayList<ComparatorBean> arr = new ArrayList<ComparatorBean>();
		
		ComparatorBean bean1 = new ComparatorBean(12000, "Zara", "Blue");
		ComparatorBean bean2 = new ComparatorBean(1200, "Arrow", "Red");
		ComparatorBean bean3 = new ComparatorBean(12009, "Patanjali", "Green");
		
		arr.add(bean3);
		arr.add(bean1);
		arr.add(bean2);
		
		Collections.sort(arr,new ColorComparator());
		
		for(ComparatorBean b: arr){
		System.out.println("Price : "+b.price+" | Brand : "+b.brands+" | Color : "+b.color);
		}
		
	}

}
