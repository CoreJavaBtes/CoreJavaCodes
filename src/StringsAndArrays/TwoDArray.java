package StringsAndArrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Array");
		int arr[][] = new int[2][2];
		
		int ragged[][]={{2,7,6},
						{6},
						{9,0,8,6,8}};
		
		/*for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j]=sn.nextInt();
				//arr[i][j] = (int)(Math.random()+2)*100;
			}
		}*/
		
		for(int i=0; i<ragged.length;i++)
		{
			for(int j=0; j<ragged[i].length;j++)
			{
				//arr[i][j]=sn.nextInt();
				System.out.print(ragged[i][j]+"\t");
			}System.out.println();
		}
		
	

	}

}
