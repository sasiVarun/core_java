package maccess;
import java.util.*;

public class DException2 extends Exception{

	public DException2(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the age of user:");
			int age = sc.nextInt();
			if(age<18) //Condition_to_raise_Exception
			{
				DException2 ob = new DException2("User NotValid for Voting..");
				throw ob;
			}
			System.out.println("User valid for Voting...");
			System.out.println("Age:"+age);
		}//end of try
		catch(DException2 ob) {
			System.out.println(ob.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
