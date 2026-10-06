package javaTutorial;

public class CounterDemo {
	
	public static void main(String [] args) {
		
		Counter counter = new Counter();
		
		Thread t1 = new Thread(() ->{
			counter.increment();
		});
		
		Thread t2 = new Thread(() ->{
			counter.increment();
		});
		
		t1.start();
		t2.start();
		
		try {
		    t1.join();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		try {
		    t2.join();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		System.out.println("Current thread: " + Thread.currentThread().getName());
		System.out.println("Main increament");
		counter.increment();
		
		System.out.println(counter.getCount());
		
		MyRunnable task = new MyRunnable();
		Thread runnableThread = new Thread(task, "Worker-1");
		runnableThread.start();
		
		runnableThread.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Worker-1 priority: " + runnableThread.getPriority());
		
		
		
		MyRunnable task2 = new MyRunnable();
		Thread runnableThread2 = new Thread(task2, "Worker-2");
		runnableThread2.start();
		
		runnableThread2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Worker-2 priority: " + runnableThread2.getPriority());
		
		try {
		    runnableThread.join();
		} catch (InterruptedException e) {
		    System.out.println("Main thread was interrupted.");
		}
		
		try {
		    runnableThread2.join();
		} catch (InterruptedException e) {
		    System.out.println("Main thread was interrupted.");
		}

	}

}
