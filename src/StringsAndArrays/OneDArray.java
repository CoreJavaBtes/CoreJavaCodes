package StringsAndArrays;

import java.util.Scanner;

public class OneDArray {
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr1  = {4,3,2,1,4};
	System.out.println("Enter 10 elements in array");
	
	for(int i = 0; i<arr.length; i++){
			arr[i]= sn.nextInt();
		}
	
	for(int i = 0; i<arr.length; i++){
		System.out.println("elements in array = "+arr[i]);
	}
		
	for(int var : arr1)
	{
		System.out.println(var);
	}
		
	}

}
