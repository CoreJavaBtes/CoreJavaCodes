package BasicPrograms;

public class TernaryDemo {
	
	public static void main(String[] args) {
		
	
		
		
		
		int x =10;
		int a = 20,b=30,c=100;
		String h1 = x >100 ?"X is greater":"is lesser";
		String h2 = a>b? a>c?"a is greater" : "c is greater" : b>c ? "b is greater":"c is greater";
		System.out.println("....."+h2);
	}

}
