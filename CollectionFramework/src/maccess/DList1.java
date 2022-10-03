package maccess;
import java.util.*;
public class DList1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		List<Integer> list = null;
		System.out.println("***Choice***");
		System.out.println("1.ArrayList\n2.LinkedList\n3.Vector");
		System.out.println("Enter the Choice");
		int choice = s.nextInt();
		switch(choice) {
		case 1:
			list = new ArrayList<Integer>();
			System.out.println("ArrayList Object Created");
			break;
		case 2:
			list = new LinkedList<Integer>();
			System.out.println("LinkedList Object Created");
			break;
		case 3:
			list = new Vector<Integer>();
			System.out.println("Vector Object Created");
			break;
		default:
			System.out.println("Invalid Choice...");
			System.exit(0);
		}// end of switch
		
		System.out.println("Enter the number of Integer Objects");
		int intSize = s.nextInt();
		
		System.out.println("Enter " + intSize + " Integer Objects");
		for(int i=1; i<=intSize; i++) {
			list.add(new Integer(s.nextInt()));
		}// end of for loop
		
		System.out.println("====Display from Set Object====");
		System.out.println(list.toString());
	}
}
