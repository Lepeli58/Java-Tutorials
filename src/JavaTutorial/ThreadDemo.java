package javaTutorial;

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread thread = new MyThread("Thread 1");
		MyThread thread2 = new MyThread("Thread 2");
		
		thread.start();
		
		try {
			thread.join();
			
		}catch (InterruptedException e) {
		System.out.println("Thread was interrupted.");
		}
		thread2.start();
		
		System.out.println("Main thread is running First.");
		
		
	}

}
