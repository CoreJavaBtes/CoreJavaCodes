package BasicPrograms;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int arr[] = new int[5];
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter an Array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sn.nextInt();
		}
		int small = arr[0];
		
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i]<small){
				small = arr[i];
			}
			 //sum = sum + arr[i];
		}
		System.out.println("===="+small);
	}

}
