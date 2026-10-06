package javaTutorial;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		
		
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    System.out.println("Thread was interrupted.");
		}
		
		System.out.println("Runnable thread: " + Thread.currentThread().getName());
		
		Thread.yield();
		
		System.out.println(Thread.currentThread().getName() + " is running.");
	}
	

}
