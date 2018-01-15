package OOPs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dEMOmETHODS {
	
	int var = 200;
	//with parameter lis, with return type
	
	float Addition(int x, float y)
	{
		float res = x+y;
		return res;
	}
	
	void mul(int x, int y){
		int res = x*y;
		
		System.out.println("Result3 ::"+res);
	}
	
	int sub(){
	int res = var*var;	
		return res;
	}
	
	void add()
	{
		System.out.println("result4 :: "+var);
	}
	
	static void test(){
		System.out.println("I am static from another class");
	}
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader obj1 = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj1);
		
		System.out.println("Enter 2 Numbers :: ");
		int a = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int b = Integer.parseInt(s);
		
		dEMOmETHODS obj = new dEMOmETHODS();
		
		float var1 = obj.Addition(a, b);
		obj.mul(a,b);
		int var2=obj.sub();
		obj.add();
		
		System.out.println("First Result ::"+ var1);
		System.out.println("2nd Result ::"+ var2);
		
	}

}























