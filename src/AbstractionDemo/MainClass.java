package AbstractionDemo;

public class MainClass {
	
	public static void main(String[] args) {
		
	
	
		AbsClass obj1;
		 obj1 = new DemoAbs1(6.8);
//		obj1.start();
		
		 obj1 = new DemoAbs2(12.0);
		obj1.start();
		
	
		AbsClass obj = new AbsClass() {
			
			@Override
			void area() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void Vol() {
				// TODO Auto-generated method stub
				
			}
		};
		obj.start();
		
		
	}

}





















