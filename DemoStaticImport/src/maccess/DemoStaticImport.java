package maccess;
import java.util.Scanner;
import static java.lang.Math.*;
public class DemoStaticImport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		double val = sc.nextDouble();
		double z = sqrt(val); // Method is access without class name
		System.out.println("sqrt of " + val + " is " + z);
		sc.close(); //Closing the input connection

	}

}
