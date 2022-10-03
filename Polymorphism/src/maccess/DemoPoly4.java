package maccess;
import test.*;
import java.util.*;
public class DemoPoly4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			System.out.println("Enter the UserName");
			String uName = s.nextLine();
			System.out.println("Enter the Password");
			String pWord = s.nextLine();
			User u = new User(uName,pWord);//Immutable Object
			
			System.out.println("Username: "+u.getUserName());
			System.out.println("Password: "+u.getPassWord());
			
		}//end of try
	}

}
