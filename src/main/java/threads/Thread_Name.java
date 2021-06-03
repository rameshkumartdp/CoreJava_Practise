package threads;

public class Thread_Name implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Thread_Name tn= new Thread_Name();
		Thread t = new Thread(tn);
		System.out.println("Thread status------>     "+t.isAlive());
		t.start();
		System.out.println("Thread status------>     "+t.isAlive());
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
	}

}
