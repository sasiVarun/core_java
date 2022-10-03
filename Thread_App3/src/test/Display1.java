package test;

public class Display1{
	
	public static void dis1() {
		for(int i=1;i<=5;i++) {
			System.out.println("Task_One:"+i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//end of loop
	}
}
