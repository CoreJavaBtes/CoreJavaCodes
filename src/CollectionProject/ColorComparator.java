package CollectionProject;

import java.util.Comparator;

public class ColorComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		ComparatorBean b1 = (ComparatorBean) arg0;
		ComparatorBean b2 = (ComparatorBean) arg1;
		
		
		
		return b1.color.compareTo(b2.color);
	}

}
