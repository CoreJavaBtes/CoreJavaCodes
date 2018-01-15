package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DemoCollection {
	
	public static void main(String[] args) {
		System.out.println("1 To Sort Acc to Price ");
		System.out.println("2 To Sort Acc to Brand ");
		System.out.println("3 To Exit ");
		System.out.println("Enter Your Choice");
		
		Scanner sn = new Scanner(System.in);
		
		
		
		BeanProduct bean1 = new BeanProduct(2500, "Adidas", "Blue");
		BeanProduct bean2 = new BeanProduct(1600, "Zara", "Red");
		BeanProduct bean3 = new BeanProduct(3400, "Arrow", "Orange");
		BeanProduct bean4 = new BeanProduct(500, "Tommy", "White");
		
		ArrayList<BeanProduct> al = new ArrayList<BeanProduct>(); 
		al.add(bean1);
		al.add(bean2);
		al.add(bean3);
		al.add(bean4);
		int ch;
		do
		{
			 ch = sn.nextInt();
		switch (ch) {
		case 1:
			Collections.sort(al, new PriceComparator());
			
			break;
		case 2:
			Collections.sort(al, new BrandComrator());
			break;
		default:
			System.exit(0);
			break;
		}
		for(BeanProduct bean : al)
		{
			System.out.println("Object:: "+bean);
			System.out.println("Brand :: "+bean.getBrand());
			System.out.println("Price :: "+bean.getPrice());
			System.out.println("Color :: "+bean.getColor());
			System.out.println(" ");
		}
	
		}while(ch!=3);
		
		
	}

}
