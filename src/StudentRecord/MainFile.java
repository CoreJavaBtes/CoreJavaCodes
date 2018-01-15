package StudentRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class MainFile {
	Scanner sn;
	int ch;
	double f_score;
	BufferedReader br;
	BeanClass bean;
	Student_bean s_bean;
	ScoreBean score;
	double sum,average;
	String course_code, course_name, student_id, student_name;
	char ch1;
	boolean status = true;
	
	//List Declaration to store data
	ArrayList<ScoreBean> arr_score = new ArrayList<ScoreBean>();
	ArrayList<BeanClass> arr_bean = new ArrayList<BeanClass>();
	ArrayList<Student_bean> arr_sbean = new ArrayList<Student_bean>();
	ArrayList<Double> arr = new ArrayList<Double>();
	

	public MainFile() throws IOException {		//Constructor
		br = new BufferedReader(new InputStreamReader(System.in));

		sn = new Scanner(System.in);// used to take input from user
		
		//Display Welcome Message
		for (int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("--------Welcome to FedUni Results Manager---------");
		

		for (int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
		firstMenu(); // Call first Main Menu
	}

	public static void main(String[] args) throws IOException {
		new MainFile();
	}

	public void firstMenu() throws IOException { // Create First main Menu
		System.out.println("Main Menu - please select an option:");
		System.out.println("1.) Add course ");
		System.out.println("2.) Add student ");
		System.out.println("3.) Add result");
		System.out.println("4.) View results");
		System.out.println("5.) Quit ");

		do {
			ch = sn.nextInt();// input variable
			if (ch <= 0 || ch > 6) // Code to enter right ch from
									// user
			{
				System.out
						.println("Value must be between 1 and 6. Please try again: ");
			} else {
				firstMenuSelection(ch); // call first menu method with user
										// input
										// variable
			}
		} while (true);

	}

	

	public void firstMenuSelection(int ch) throws IOException { // Selection of different cases

		switch (ch) {
		case 1:

			do {
				System.out.println("Please enter course code: ");
				course_code = br.readLine();
				System.out.println("Please enter course name: ");
				course_name = br.readLine();

				bean = new BeanClass(course_code, course_name);
				arr_bean.add(bean);
				System.out
						.println("Would you like to [A]dd a new course or [R]eturn to the previous menu? ");

				ch1 = br.readLine().charAt(0);// input variable

			} while (ch1 == 'A' || ch1 == 'a');
			firstMenu();

			break;

		case 2:

			do {
				System.out.println("Please enter student id: ");
				student_id = br.readLine();
				System.out.println("Please enter student name: ");
				student_name = br.readLine();

				s_bean = new Student_bean(student_id, student_name);
				arr_sbean.add(s_bean);
				System.out
						.println("Would you like to [A]dd a new course or [R]eturn to the previous menu? ");

				ch1 = br.readLine().charAt(0);// input variable

			} while (ch1 == 'A' || ch1 == 'a');
			firstMenu();

			break;

		case 3:

			do {
				checkStuId();
				System.out
						.println("Would you like to [A]dd a new course or [R]eturn to the previous menu? ");

				ch1 = br.readLine().charAt(0);// input variable

			} while (ch1 == 'A' || ch1 == 'a');
			firstMenu();
			break;

		case 4:

			do {
				//checkStuId();
				System.out
						.println("Would you like to view [C]ourse results, [S]tudent results or [R]eturn?");

				ch1 = br.readLine().charAt(0);// input variable
				
				if(ch1== 'C' || ch1 == 'c')
				{
					viewResultByCourse();
				}else if(ch1 == 'S' || ch1 == 's')
				{
					viewResultByStudent();
				}

			} while (ch1 == 'C' || ch1 == 'c' ||ch1=='S'  || ch1 == 's');
			firstMenu();
			break;
			
		case 5:
			System.exit(0);
			break;
			

		default:

		}
	}
//Different Methods for different functionalities
	
	public void viewResultByCourse() throws IOException		//Method for 4th Module
	{
		do {
			
			System.out.println("Please enter course code: ");
			course_code = br.readLine();
			
			for (ScoreBean s : arr_score) {
				
				if (course_code.equals(s.getC_code())) {
					
					arr.add(s.getF_score());
					System.out.println("Results for course: "+course_code);
					System.out.println(s.getS_id()+" - "+s.getS_name()+" - "+s.getF_score());
					status = false;
				} else{
					
					status = true;
				}
			}
			if(status==true)
			{
				System.out.println("Course does not exist.");
			}

			if(arr.size()>0){
			Collections.sort(arr);
			
			System.out.println("Minimum score: "+arr.get(0));
			System.out.println("Maximum score: "+arr.get(arr.size()-1));
			}
			
		} while (status);

	}

	public void viewResultByStudent() throws IOException		//Method for 4th Module
	{
		do {
			
			System.out.println("Please enter student id: ");
			student_id = br.readLine();
			
			for (ScoreBean s : arr_score) {
				
				if (student_id.equals(s.getS_id())) {
					
					arr.add(s.getF_score());
					System.out.println("Results for course: "+student_id+" - "+s.getS_name());
					System.out.println(s.getC_code()+" - "+s.getF_score());
					
					status = false;
				} else{
					
					status = true;
				}
			}
			if(status==true)
			{
				System.out.println("Student does not exist.");
			}
			if(arr.size()>0)
			{
				for(double d : arr)
				{
					sum = sum+d;
				}
				average = sum/arr.size();
				System.out.println("Average result: "+average);
			}
			
			
		} while (status);

	}

	
	
	public void checkStuId() throws IOException {		//Method for 3rd Module
		do {
			
			System.out.println("Please enter student id: ");
			student_id = br.readLine();
			
			for (Student_bean s : arr_sbean) {
				
				if (student_id.equals(s.getS_id())) {

					checkCourse(student_id,s.getS_name());
					status = false;
					break;
				} else{
					
					status = true;
				}
			}
			if(status==true)
			{
				System.out.println("Student does not exist.");
			}

		} while (status);
	}

	public void checkCourse(String stu_id,String stu_name) throws IOException {		//Method for 3rd Module
		do {
			System.out.println("Please enter course code: ");
			course_code = br.readLine();
			for (BeanClass s : arr_bean) {
				if (course_code.equals(s.getC_code())) {
					EnterScore(stu_id,stu_name, course_code);
					status = false;
					break;
				} else {
					
					status = true;
				}
			}
			if(status==true)
			{
				System.out.println("Course does not exist.");
			}

		} while (status);
	}

	public void EnterScore(String stu_id,String stu_name, String cor_code) {		//Method for 3rd Module
		do {
			System.out.println("Please enter final score: ");
			
			while (!sn.hasNextDouble())
			{
			    System.out.println("Score is not between 0.0 and 100.0 inclusive.");
			    System.out.println("Please enter final score: ");
			    sn.next();
			}
			f_score = sn.nextDouble();
			if (f_score > 0.0 && f_score <= 100.0) {
				score = new ScoreBean(stu_id,stu_name, cor_code, f_score);
				arr_score.add(score);
				status = false;
				
			} else {
				
				status = true;

			}
			if(status==true){
				System.out
				.println("Score is not between 0.0 and 100.0 inclusive.");
			}

		} while (status);
	}
}
