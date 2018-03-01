package Threadss;

public class ThredByThread extends Thread{

	String name;
	int time;
	
	public ThredByThread() {
		// TODO Auto-generated constructor stub
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i = 0; i<5; i++){
			System.out.println("Thread :: "+i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
