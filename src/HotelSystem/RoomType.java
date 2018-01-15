package HotelSystem;

public class RoomType {
	
	String name;
	public String getName() {
		return name;
	}

	public int getRegularPrice() {
		return regularPrice;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public int getMaximumOccupancy() {
		return maximumOccupancy;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public int getNumberOfVacancies() {
		return numberOfVacancies;
	}

	int regularPrice; 
	int salePrice;
	public void setSalePrice(int newPrice) {
		this.salePrice = newPrice;
	}

	int maximumOccupancy;
	int numberOfRooms;
	 int numberOfVacancies;
	
	 RoomType(String _name, int _regularPrice, int _salePrice,
			 int _maximumOccupancy, int _numberOfRooms,
			 int _numberOfVacancies){
		 
		 name = _name;
		 regularPrice = _regularPrice;
		 salePrice = _salePrice;
		 maximumOccupancy = _maximumOccupancy;
		 numberOfRooms = _numberOfRooms;
		 numberOfVacancies = _numberOfVacancies;
		 
	 }

}
