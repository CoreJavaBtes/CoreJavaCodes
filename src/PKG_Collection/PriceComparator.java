package PKG_Collection;

import java.util.Comparator;

public class PriceComparator implements Comparator {

Bean_Class b1,b2;
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		b1 = (Bean_Class) o1;
		b2 = (Bean_Class) o2;
		
		if(b1.price==b2.price)
		{
			return 0;
		}else if(b1.price>b2.price)
		{
			return 1;
		}else{
			return-1;
		}
		//return b1.brand.compareTo(b2.brand);
		
		
	}

}
