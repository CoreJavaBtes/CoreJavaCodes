package HotelSystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.net.ssl.SSLEngineResult.Status;

public class HotelDetails {

	static Hotel hotel1, hotel2, hotel3, hotel4;
	static RoomType El_Grando1, El_Grando2, El_Grando3, Ivory_Tower1, Ivory_Tower2, Ivory_Tower3, Elite1, Elite2,
			Elite3, Elite4, Fleabox_Motel;
	static ArrayList<Hotel> hotel_arr = new ArrayList<Hotel>();

	public static void DataEntery() {  //Method for data Entry
		// Objects of Hotels
		hotel1 = new Hotel("El Grando", "Lakeside Drive, San Diego", 3, 3);
		hotel2 = new Hotel("Ivory Tower", "Pinehill Road, Boston", 4, 3);
		hotel3 = new Hotel("Elite", "Federation Drive,Washington DC", 5, 4);
		hotel4 = new Hotel("Fleabox MotelEl Grando", "Wrong Side of the Tracks Road, Cleveland", 1, 1);

		// Objects of RoomTypes
		El_Grando1 = new RoomType("Executive studio", 210, 210, 2, 20, 17);
		El_Grando2 = new RoomType("Standard studio", 180, 10, 2, 30, 10);
		El_Grando3 = new RoomType("Family room", 220, 200, 4, 10, 2);

		Ivory_Tower1 = new RoomType("Executive studio", 235, 235, 2, 5, 3);
		Ivory_Tower2 = new RoomType("Standard studio", 205, 205, 2, 12, 0);
		Ivory_Tower3 = new RoomType("Super-sized family room", 350, 350, 6, 4, 1);

		Elite1 = new RoomType("Ultra-luxury suite", 890, 890, 2, 5, 3);
		Elite2 = new RoomType("Elitist Studio", 1400, 1400, 1, 1, 1);
		Elite3 = new RoomType("Penthouse Apartment", 1200, 1200, 4, 3, 2);
		Elite4 = new RoomType("Gold-plated Luxury", 1799, 1799, 2, 10, 8);

		Fleabox_Motel = new RoomType("Sardine Room", 80, 55, 8, 120, 25);

		// Array of roomtype for Hotel1
		RoomType[] EL_Room = { El_Grando1, El_Grando2, El_Grando3 };
		RoomType[] Ivory_Room = { Ivory_Tower1, Ivory_Tower2, Ivory_Tower3 };
		RoomType[] Elite_Room = { Elite1, Elite2, Elite3, Elite4 };
		RoomType[] Fleabox_Room = { Fleabox_Motel };

		// pass the array to first hotel object
		hotel1.setRoomtype(EL_Room);
		hotel2.setRoomtype(Ivory_Room);
		hotel3.setRoomtype(Elite_Room);
		hotel4.setRoomtype(Fleabox_Room);
		
		//Arraylist of Hotel objects
		hotel_arr.add(hotel1);
		hotel_arr.add(hotel2);
		hotel_arr.add(hotel3);
		hotel_arr.add(hotel4);

	}

	//Method to print the hotel details with room listing
	public static void printData(String hotel, RoomType[] room) {
		System.out.println("===================================================");
		System.out.println(hotel);
		System.out.println("===================================================");
		System.out.println("");
		for (RoomType s : room) {
			System.out.println("Room type: " + s.getName());
			System.out.println("Maximum occupancy: " + s.getMaximumOccupancy());
			if (s.getRegularPrice() == s.getSalePrice()) {
				System.out.println("Regular price: " + s.getRegularPrice());

			} else {
				System.out.println("Regular price: " + s.getRegularPrice());
				System.out.println("Sale price: " + s.getSalePrice());
			}
			System.out.println("");
		}

	}

	//Method to print Room Listing
	public static void printData(RoomType s) {

		System.out.println("Room type: " + s.getName());
		System.out.println("Maximum occupancy: " + s.getMaximumOccupancy());
		if (s.getRegularPrice() == s.getSalePrice()) {
			System.out.println("Regular price: " + s.getRegularPrice());

		} else {
			System.out.println("Regular price: " + s.getRegularPrice());
			System.out.println("Sale price: " + s.getSalePrice());
		}
		System.out.println("");

	}
	
	//Method to print Hotel Name
	public static void printData(String hotel) {
		System.out.println("===================================================");
		System.out.println(hotel);
		System.out.println("===================================================");
		System.out.println("");

	}

	static RoomType[] room;
	static boolean status;

	//Method to set the sale price- Main Menu Option-3
	public static boolean salePrice(String name, Scanner sn) throws IOException {
		
		for (Hotel s : hotel_arr) {
			if (name.equals(s.getName())) {
				room = s.getRoomtype();
				for (int i = 0; i < room.length; i++) {
					System.out.println(i + 1 + ". " + room[i].getName());
					status = false;

				}
				System.out.print("Enter room type number: ");

				do {
					int num = sn.nextInt();// input variable
					if (num <= 0 || num > 4) // Code to enter right ch from
												// user
					{
						System.out.println("Value must be between 1 and 4. Please try again: ");
					} else {
						System.out.print("Regular price = $" + room[num - 1].getRegularPrice() + "   ");
						System.out.println("Current sale price = $" + room[num - 1].getSalePrice());
						System.out.println("Enter sale price: $");

						do {
							int sale = sn.nextInt();
							if (sale <= (room[num - 1].getSalePrice()) / 2 || sale > (room[num - 1].getSalePrice())) {
								System.out.println("Value must be between " + (room[num - 1].getSalePrice()) / 2
										+ " and " + (room[num - 1].getSalePrice()) + ". Please try again: ");
							} else {
								room[num - 1].setSalePrice(sale);
								System.out.println("Sale price updated.");
								System.out.println("");
								Driver.Menu();

							}
						} while (true);

					}
				} while (true);

			} else {

				status = true;
			}
		}
		if (status == true) {
			System.out.println("No hotel matches that name. Please try again.");
		}

		return status;

	}

	//Method to get the room with specified criteria- Main Menu Option-4
	public static void criteriaForRoom(int min_occ, int max_rate, int min_star) {

		for (Hotel s : hotel_arr) {
			if (min_star <= s.getStarRating()) {
				room = s.getRoomtype();

				printData(s.toString());

				for (int i = 0; i < room.length; i++) {

					if (min_occ <= room[i].getMaximumOccupancy() && max_rate >= room[i].getRegularPrice()) {
						printData(room[i]);

					}

				}

			}
		}
	}

	static int pos;
	static String hotel_name;

	//Method to find the cheapest room- Main Menu Option-2
	public static void cheapestRoom() {

		for (Hotel s : hotel_arr) {

			room = s.getRoomtype();

			int temp = room[0].getRegularPrice();

			for (int i = 0; i < room.length; i++) {

				if (temp >= room[i].getRegularPrice()) {
					temp = room[i].getRegularPrice();
					pos = i;
					hotel_name = s.toString();
					// printData(room[i]);
				}

			}

		}
		printData(hotel_name);
		printData(room[pos]);
	}

}
