package CollectionProject;

import java.util.Comparator;

public class PriceComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		BeanProduct bp1 = (BeanProduct) o1;
		BeanProduct bp2 = (BeanProduct) o2;
		
		
		// TODO Auto-generated method stub
		
		if(bp1.Price == bp2.Price)
		{return 0;}
		else if(bp1.Price > bp2.Price)
		{
			return 1;
		}else{
			return -1;
		}
	}

}
