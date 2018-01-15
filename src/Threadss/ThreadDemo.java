package Threadss;

public class ThreadDemo implements Runnable {

	Thread t;
	String name;
	int p;
	public ThreadDemo(String name,int p) {
		// TODO Auto-generated constructor stub
		t = new Thread(this,name);
		this.p = p;
		this.name = name;
		t.start();
	
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<10; i++)
		{
			t.setPriority(p);
			//System.out.println(name +" ::  "+i);
			System.out.println(t.currentThread().getName() +" ::  "+i);
			System.out.println(t.currentThread().getPriority() +" ::  "+t.currentThread().getName());
		//	System.out.println( " ::  "+t.currentThread().getName());
			//t.currentThread().suspend();
		System.out.println("......."+i);
			try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
		}System.out.println(t.isAlive() +" ::  "+t.currentThread().getName());
		
	}

}









