package maccess;
import test.*;
public class DThread1 {

	public static void main(String[] args) {
				
//		Runnable r1 = Display1 :: dis1;
//		Runnable r2 = Display2 :: dis2;
		
		Thread t1 = new Thread(Display1 :: dis1);
		Thread t2 = new Thread(Display2 :: dis2);
		
		t1.start();
		t2.start();
	}

}
