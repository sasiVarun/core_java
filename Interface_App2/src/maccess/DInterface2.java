package maccess;
import java.util.Scanner;
import test.*;
public class DInterface2 {

	public static void main(String[] args) {
//		IComparable ob = new IComparable(); //Error
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value1:");
		int v1 = sc.nextInt();
		System.out.println("Enter the value2:");
		int v2 = sc.nextInt();
		System.out.println("=== Choice ===");
		System.out.println("1. Greater \n2. Smaller");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Greater gt = new Greater(); //Implementation object
			System.out.println("Greater Values:" + gt.compare(v1, v2));
			break;
		case 2:
			Smaller sm = new Smaller();
			System.out.println("Smaller value: " + sm.compare(v1, v2));
			break;
		default:
			System.out.println("Invalid Choice...");
		}
		sc.close();
	}
}