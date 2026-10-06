package javaTutorial;

public class Counter {
	
	private int count = 0;
	
	public synchronized void increment() {
		int temp = count;
		
		try {
			Thread.sleep(10);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		count = temp + 1;
	}
	public int getCount() {
		return count;
	}

}
