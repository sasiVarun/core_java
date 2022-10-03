package maccess;
import java.util.*;
import java.io.*;

public class DFile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			try {
			System.out.println("Enter the File Path & File Name(Source)");
			File f1 = new File(s.nextLine());			
			FileInputStream fis = new FileInputStream(f1);
			
			System.out.println("Enter the File Path & File Name(Destination)");
			File f2 = new File(s.nextLine());
			FileOutputStream fos = new FileOutputStream(f2);
			
			int k;
			
			while((k=fis.read())!=-1) {
				fos.write(k);
			}
			
			fos.close();
			fis.close();
			} catch (Exception e) {			
				e.printStackTrace();
			}
		}//end with try-resource
		
	}
}
