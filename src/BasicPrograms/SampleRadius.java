package BasicPrograms;

public class SampleRadius {
	
	public static void main(String[] args) {
		
		
		SampleRadius obj = new SampleRadius();
		double dd = obj.CoordDistance(30.72213381, 76.77070505, 30.72191249, 76.77104799);
		System.out.println(dd);
		
	}
	
	double CoordDistance(double latitude1, double longitude1, double latitude2, double longitude2)
	{
	    return 6371 * Math.acos(
	        Math.sin(latitude1) * Math.sin(latitude2)
	        + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude2 - longitude1));
	}

}
