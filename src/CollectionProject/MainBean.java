package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;

public class MainBean {

	public static void main(String[] args) {
		
		ArrayList<BeanProduct> al = new ArrayList<BeanProduct>();
		
		BeanProduct bean = new BeanProduct(2000, "Adidas", "Black");
		BeanProduct bean1 = new BeanProduct(5000, "Zara", "Red");
		BeanProduct bean2 = new BeanProduct(1200, "Madame", "White");
		
		al.add(bean);
		al.add(bean1);
		al.add(bean2);
		
		Collections.sort(al, new PriceComparator());
		
		for (BeanProduct beanProduct : al) {
			System.out.println(beanProduct.getBrand());
			System.out.println(beanProduct.getColor());
			System.out.println(beanProduct.getPrice());
			System.out.println("");
		}
		
	}
}
