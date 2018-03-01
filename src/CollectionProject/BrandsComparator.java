package CollectionProject;

import java.util.Comparator;

public class BrandsComparator implements Comparator {

	ComparatorBean bean1,bean2;
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		bean1 = (ComparatorBean) o1;
		bean2 = (ComparatorBean) o2;
		
		
		return bean1.brands.compareTo(bean2.brands);
	}

}
