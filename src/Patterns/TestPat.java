package Patterns;

public class TestPat {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){
			if(i%2!=0){
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			}
			System.out.println("");
		}
	}

}
