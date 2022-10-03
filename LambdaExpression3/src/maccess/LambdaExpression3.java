package maccess;
import java.util.Scanner;
import test.*;
public class LambdaExpression3 {

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
			IComparable gt = (int x, int y) ->
			{
					if(x>y) return x;
					else return y;
			}; 
			System.out.println("Greater Values:" + gt.compare(v1, v2));
			break;
		case 2:
			IComparable sm = (int x, int y) ->
			{
					if(x<y) return x;
					else return y;
			};
			System.out.println("Smaller value: " + sm.compare(v1, v2));
			break;
		default:
			System.out.println("Invalid Choice...");
		}
		sc.close();
	}
}