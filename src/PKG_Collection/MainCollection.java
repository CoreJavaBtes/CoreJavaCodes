package PKG_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainCollection {
	
	public static void main(String[] args) {
		
		Bean_Class bean = new Bean_Class("Red", "ZARA", 12000.89);
		Bean_Class bean1 = new Bean_Class("Black", "Arrow", 1234.23);
		Bean_Class bean2 = new Bean_Class("Blue", "Guess", 79595.23);
	
		ArrayList<Bean_Class>  al = new ArrayList<Bean_Class>();
		al.add(bean);
		al.add(bean1);
		al.add(bean2);
		
		Collections.sort(al, new PriceComparator());
		//Collections.sort(al);
		for(Bean_Class obj : al)
		{
			System.out.println("Brand :: "+obj.getBrand());
			System.out.println("Price :: "+obj.getPrice());
			System.out.println("color :: "+obj.getColor());
			System.out.println(" "+obj);
		}
		
		
		
	}

}
