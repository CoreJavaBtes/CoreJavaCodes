package Threadss;

class M1 extends Thread {
	Synchro s;

	M1(Synchro s) {
		this.s = s;
		start();
	}

	public void run() {
		s.deposit(1000);

	}

}

class M2 extends Thread {
	Synchro s;

	M2(Synchro s) {
		this.s = s;
		start();

	}

	public void run() {
		s.deposit(500);

	}

}

public class Synchro {
	int bal = 1000;

	synchronized void deposit(int amt) {

		int temp = bal;
		temp = temp + amt;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		bal = temp;
		System.out.println("Accont Balance= " + bal);

	}

	public static void main(String args[]) {
		Synchro s = new Synchro();
		M1 m = new M1(s);

		M2 m1 = new M2(s);

	}
}

