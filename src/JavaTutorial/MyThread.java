package javaTutorial;

public class MyThread extends Thread {
	
	
	private String threadName;
	
	public MyThread(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("Thread was interrupted");
		}
		System.out.println(threadName + " is running.");
	}

}
