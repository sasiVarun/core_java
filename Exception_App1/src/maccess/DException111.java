package maccess;
import java.util.*;
public class DException111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value");
			int v = sc.nextInt();//Exception when we read other than int_value
			int k = 44/v; //Exception when v=0
			System.out.println("The value of k:"+k);
		}// end of try
		catch(InputMismatchException | ArithmeticException ob) {
			System.out.println("Enter only NonZero Integer Values...");
			System.out.println(ob.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
