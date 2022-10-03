package test;

public class Display2 implements Runnable{
	@Override
	public void run() {
		for(int i=101;i<=105;i++) {
			System.out.println("Task_two:"+i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//end of loop
	}
}
