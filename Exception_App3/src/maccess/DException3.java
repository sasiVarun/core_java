package maccess;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DException3 {

	public static void main(String[] args) {
		for(int i=1; i<111111; i++) {
			System.out.println("Value:"+i);
			/*
			 * try { DriverManager.getConnection("","",""); } catch (SQLException se) {
			 * se.printStackTrace(); }
			 */
			try {
				Thread.sleep(2);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
