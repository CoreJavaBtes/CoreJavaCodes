
public class ScopeOfVariables {
	
	int a = 10;		//global variable
	static int x = 100;   //static variable
	
	//Method
	void show(){	
		int s=20; // Local Variable
		
		int sum = s+a+x;
		System.out.println("Sum is : "+sum);
		x++;
		s++;
		a++;
		
	}
	
	void show1(){
		System.out.println(" Global a :: "+a);
		System.out.println(" static x :: "+x);
	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScopeOfVariables obj = new ScopeOfVariables();
		ScopeOfVariables obj1 = new ScopeOfVariables();
		
		obj.show();
		obj.show1();
		obj.show();
		obj.show1();
		obj1.show();
		obj1.show1();

	}

}
