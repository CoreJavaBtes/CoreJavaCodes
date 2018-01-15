package HotelSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Driver {		//Driver Class contained main method
	static Scanner sn;
	static int ch;
	static boolean status;
	static BufferedReader br;
	
	//Constructor of class
	public Driver() throws IOException {
		 br = new BufferedReader(new InputStreamReader(System.in));		// Initialization of variables
		sn = new Scanner(System.in);
		//Welcome Message
		System.out.println("\t\tWelcome to the Hotel Recommendation System\nDeveloped by Bhagyadeep Sahota, student ID 30328533 for ITECH1000 Semester 1 2017");
		System.out.println("");
		HotelDetails.DataEntery(); //Call for Data Entry 
		Menu();
	}
	
	public static void main(String[] args) throws IOException {
		
		
		new Driver();
		
	
		
	}

	
	public static void Menu() throws IOException //Main Menu Method
	{
		
		System.out.println("MAIN MENU ");
		System.out.println("Please select an option from the menu: ");
		System.out.println("1. Display all hotels ");
		System.out.println("2. Find cheapest room");
		System.out.println("3. Set a sale price ");
		System.out.println("4. Find rooms matching criteria ");
		System.out.println("5. Exit System");
		
		
		

		do {
			ch = sn.nextInt();// input variable
			if (ch <= 0 || ch > 5) // Code to enter right ch from
											// user
			{
				System.out
						.println("Value must be between 1 and 5. Please try again: ");
			} else {
				MenuSelection(ch); // call first menu method with user input
										// variable
			}
		} while (true);
	}
	
	

	public static void MenuSelection(int ch) throws IOException
	{
		switch (ch) {
		case 1:
			HotelDetails.printData(HotelDetails.hotel1.toString(), HotelDetails.hotel1.getRoomtype());
			HotelDetails.printData(HotelDetails.hotel2.toString(), HotelDetails.hotel2.getRoomtype());
			HotelDetails.printData(HotelDetails.hotel3.toString(), HotelDetails.hotel3.getRoomtype());
			HotelDetails.printData(HotelDetails.hotel4.toString(), HotelDetails.hotel4.getRoomtype());
			
			Menu();
			break;
			
		case 2:
			
			HotelDetails.cheapestRoom();
			Menu();
			break;
		case 3:
			System.out.println("Setting sale price ");
			System.out.println("");
			do{
			System.out.print("Enter hotel name: ");
			String hotel_name =  br.readLine();;
			
			status = HotelDetails.salePrice(hotel_name,sn);
			
			}while(status);
			
			
			break;
			
		case 4:
			System.out.println("Please enter the criteria which you require.");
			System.out.println("Minimum occupancy required: ");
			int mini_occ = sn.nextInt();
			System.out.println("Minimum star rating required: ");
			int mini_star = sn.nextInt();
			System.out.println("Maximum daily price you are willing to pay: ");
			int Max_rate = sn.nextInt();
			HotelDetails.criteriaForRoom(mini_occ, Max_rate, mini_star);
			Menu();
			break;
			
		case 5:
			System.exit(0);
			break;
			
		default:
			break;
		}
	}

}
