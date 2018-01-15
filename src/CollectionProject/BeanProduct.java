package CollectionProject;

public class BeanProduct/* implements Comparable*/{
	
	public int Price;
	
	public BeanProduct(int Price, String Brand, String color) {
		// TODO Auto-generated constructor stub
		this.Price = Price;
		this.Brand = Brand;
		this.color = color;
		
	}
	public int getPrice() {
		return Price;
	}
	
	public String getBrand() {
		return Brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public String Brand;
	public String color;

	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		BeanProduct bean = (BeanProduct)o;
		
		
		return Brand.compareTo(bean.Brand);
	}*/

	


	/*@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		
		BeanProduct bp = (BeanProduct)arg0;
		
		if(Price == bp.Price)
		{
			return 0;
		}else if(Price < bp.Price){
		
		return 1;
		}else{
			return -1;
		}
	}
	*/

}

