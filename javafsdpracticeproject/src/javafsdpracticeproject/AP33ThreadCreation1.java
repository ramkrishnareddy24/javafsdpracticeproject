package javafsdpracticeproject;

public class AP33ThreadCreation1 extends Thread {
	
	public void run() {
		System.out.println("Concurrent thread started running.");
	}
	
	public static void main(String[] args) {
		AP33ThreadCreation1 m = new AP33ThreadCreation1();
		m.start();
	}
}
