package maccess;
import java.io.*;
import java.util.*;
public class DemoSerialization {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Benificeary Account Number");
			long bAccNo = s.nextLong();
			
			System.out.println("Enter the Amount to be transferred");
			float amt = s.nextFloat();
			
			Translog ob1 = new Translog(bAccNo,amt,new Date());
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\samaddi\\OneDrive - Capgemini\\Desktop\\Tax\\Obj.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob1); //Serialization process
			
			System.out.println("Object stored successfully");
			
			oos.close();
			fos.close();
			s.close();
		}catch(Exception e) {e.printStackTrace();}

	}

}
