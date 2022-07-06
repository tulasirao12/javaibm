package mutltithreading;

public class SyncDemo implements Runnable{
	
	
	@Override
	public void run() {
		String name =Thread.currentThread().getName();
		print(name); 
		
	}
	public synchronized void print(String name) {
		try {
		System.out.println("[");
		Thread.sleep(1000);
		System.out.println(name);
		Thread.sleep(1000);
		System.out.println("]");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Runnable mr = new SyncDemo();
		
		Thread t1 = new Thread(mr,"First");
		
		Thread t2 =new Thread(mr, "Second");
		t1.start();
		t2.start();

	}

	

}
