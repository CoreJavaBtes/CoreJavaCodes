package Threadss;



public class ThreadByRunnable implements Runnable {
	String name;
	int time;
	Thread t;
	public ThreadByRunnable(String name,int time) {
		// TODO Auto-generated constructor stub
		t = new Thread(this);
		t.start();
		this.name = name;
		this.time = time;
		
	} 
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<5; i++){
			System.out.println(name+"......."+i);
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


		
	
	
	

}
