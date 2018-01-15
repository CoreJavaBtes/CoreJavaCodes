package CollectionProject;

import java.util.Comparator;

public class BrandComrator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		BeanProduct bp1 = (BeanProduct) arg0;
		BeanProduct bp2 = (BeanProduct) arg1;
		
		return bp1.Brand.compareTo(bp2.Brand);
	}

}
