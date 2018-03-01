package StringsAndArrays;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "i am btes student";
		String[] srr = s.split(" ");
		for(int i = srr.length-1; i>=0;i--){
			
			if(srr[i].equals("btes"))
			{
				System.out.print(" "+srr[i].toUpperCase());
			}else{
			System.out.print(" "+srr[i].substring(0, 1).toUpperCase()+srr[i].substring(1));
			}
		}
		
	}

}
