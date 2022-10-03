package maccess;
import java.io.*;

public class DemoDeSerialization {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\samaddi\\OneDrive - Capgemini\\Desktop\\Tax\\Obj.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			Translog ob2 =(Translog) ois.readObject();
			System.out.println("===Transaction Details===");
			System.out.println(ob2.toString());
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
