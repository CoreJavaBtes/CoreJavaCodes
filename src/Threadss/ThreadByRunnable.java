package Threadss;

public class ThreadByRunnable implements Runnable {
	
	Thread t;
	String name;int time;
	public ThreadByRunnable(String name,int time) {
		// TODO Auto-generated constructor stub
		t = new Thread(this);
		this.name = name;
		this.time = time;
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 10; i>0; i--)
		{
			System.out.println("Thread :: "+name + " : "+i);
			
			try {
				Thread.sleep(time
						);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
