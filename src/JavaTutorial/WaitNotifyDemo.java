package javaTutorial;

public class WaitNotifyDemo {
	
	private static final Object lock = new Object();
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Thread waitingThread = new Thread(() ->{
			System.out.println("Waiting thread: I am waiting...");
			
			synchronized (lock) {
				
				try {
					lock.wait();
					System.out.println("Waiting thread: I am awake!");
					
				}catch (InterruptedException e) {
					System.out.println("Witing thread was interrupted");
				}
			}
			
		});
		
		
		waitingThread.start();
		
		
		Thread notifyingThread = new Thread(() -> {
			
			try {
			    Thread.sleep(1000);
			} catch (InterruptedException e) {
			    System.out.println("Notifying thread was interrupted.");
			       
			}
			
			synchronized (lock) {
				
				lock.notify();

			}

		});
		
		notifyingThread.start();
	}

}
