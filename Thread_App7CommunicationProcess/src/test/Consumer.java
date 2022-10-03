package test;

public class Consumer implements Runnable {
	public Producer prod;

	public Consumer(Producer prod) {
		this.prod = prod;
	}

	@Override
	public void run() {
		synchronized (prod.sb) {
			try {
				System.out.println("Consumer is blocked temporarly");
				prod.sb.wait();
				System.out.println("Display using Consumer...");
				System.out.println(prod.sb);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}//end of lock
	}
}
