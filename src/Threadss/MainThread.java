package Threadss;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
	
		new ThredByThread("ONE",3000);
		new ThredByThread("TWO",2000);
		new ThredByThread("THREE",1000);
		
		//new  ThreadDemo("one", 10);
		//new  ThreadDemo("Two", 1);
	ThreadByRunnable obj = new ThreadByRunnable("one",1000);
	
	synchronized (obj) {
		new ThreadByRunnable("two",2000);
	}
	new ThreadByRunnable("two",2000);
	new ThreadByRunnable("three",5000);
	//new ThredByThread("One",10000);
	
	//new ThredByThread("Two",5000);

		
	}
}
