package Patterns;

public class TrianglePat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		for(int i=1;i<5;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for( k=1;k<=i;k++)
			{
				
				System.out.print(+k);
			
			}
			
			for(int d=k-2;d>0;d--)
			{
				
				System.out.print(d);
			}
			System.out.println("");
	}
	}

}
