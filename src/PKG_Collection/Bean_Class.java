package PKG_Collection;

public class Bean_Class/* implements Comparable */{
	
	String color;
	
	public Bean_Class(String color, String brand, double price) {
		// TODO Auto-generated constructor stub
		
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	String brand;
	double price;


	/*@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
	
		Bean_Class bn = (Bean_Class) arg0;
		
		if(price==bn.price)
		{
			return 0;
		}else if(price>bn.price)
		{
			return 1;
			
		}else{
			return -1;
		}
		
	}*/

	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Bean_Class b = (Bean_Class)o;
		
		
		
		return brand.compareTo(b.brand);
	}
	*/
	

}
