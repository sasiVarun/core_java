package maccess;
import test.*;
import java.util.*;
public class DException4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		try(Scanner sc = new Scanner(System.in);)//Java7
		try(sc;)//Java9
		{
			try {
				
				System.out.println("Enter the Branch:");
				String br = sc.nextLine().toUpperCase();
				BranchCheck ob = new BranchCheck(); //Constructor Call
				ob.verify(br);//method_Call
				System.out.println("Valid Student Branch...");
				System.out.println("Branch:"+br);
			} //end_of_try
			catch (BranchCheck e) 
			{
				System.out.println(e.getMessage());
			}
		}//end of try-with-resource
	}

}
