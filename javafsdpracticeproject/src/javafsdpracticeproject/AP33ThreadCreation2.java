package javafsdpracticeproject;

public class AP33ThreadCreation2 implements Runnable{
	public static int myCount = 0;
	public AP33ThreadCreation2() {
		
	}
	
	public void run() {
		while(AP33ThreadCreation2.myCount<=10) {
			try {
				System.out.println("Expl Thread: "+(++AP33ThreadCreation2.myCount));
				Thread.sleep(100);
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		AP33ThreadCreation2 mrt = new AP33ThreadCreation2();
		Thread t = new Thread(mrt);
		t.start();
		
		
		while(AP33ThreadCreation2.myCount<=10) {
			try {
				System.out.println("Main Thread: "+(++AP33ThreadCreation2.myCount));
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("Exception in Thread : "+e.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}
