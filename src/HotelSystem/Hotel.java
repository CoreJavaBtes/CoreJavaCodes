package HotelSystem;

import java.util.Arrays;

public class Hotel {
	
	String Name;
	String Address;
	int starRating;
	int numRoomTypes;
	RoomType[] roomtype;
	
	 Hotel(String _name, String _address, int _starRating, int _numRoomTypes)
	 {
		Name = _name;
		Address = _address;
		starRating = _starRating;
		numRoomTypes = _numRoomTypes;
		roomtype = new RoomType[numRoomTypes];
		
	 }
	
	public void setRoomtype(RoomType[] roomtype) {
		this.roomtype = roomtype;
	}

	public String getName() {
		return Name;
	}

	public String getAddress() {
		return Address;
	}

	public int getStarRating() {
		return starRating;
	}

	public int getNumRoomTypes() {
		return numRoomTypes;
	}

	public RoomType[] getRoomtype() {
		return roomtype;
	}


	@Override
	public String toString() {
		if(starRating == 1){
			star = "*";
		}else if(starRating==2)
		{
			star = "**";
		}else if(starRating==3)
		{
			star = "***";
		}else if(starRating==4)
		{
			star = "****";
		}else if(starRating==5)
		{
			star = "*****";
		}
		return  Name + ", " + Address + "  "
				+ star ;
	}

	String star;
	
	
}
