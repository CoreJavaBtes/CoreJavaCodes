package ControlStatements;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i = 0;
		do
		{
			 sum = sum+i;
			System.out.println(sum);
			i++;
		}while(i<10);
		
		for(int j=0; j<10;j++){
			sum +=i;
			System.out.println(sum);
		}

	}

}
