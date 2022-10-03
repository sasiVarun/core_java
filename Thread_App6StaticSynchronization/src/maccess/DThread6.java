package maccess;
import test.*;
public class DThread6 {

	public static void main(String[] args) {
				
		Thread t1 = new Thread(new User1());
		Thread t2 = new Thread(new User2());
		
		t1.setName("Alex");
		t2.setName("Brad");
		
		t1.start();
		t2.start();
	}

}
