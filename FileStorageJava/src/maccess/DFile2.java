package maccess;
import java.io.*;
import java.util.*;
public class DFile2 {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f1 = new File("C:\\Users\\samaddi\\OneDrive - Capgemini\\Desktop\\Tax\\Sample.txt");
		FileWriter fw = new FileWriter(f1);
		System.out.println("Enter the data:(@ at end)");
		char ch;
		while ((ch=(char)br.read())!='@') {
			fw.write(ch);
		}
		System.out.println("Data Stored in file Successfully..!");
		fw.close();
		System.out.println("Display from file");
		FileReader fr = new FileReader("C:\\Users\\samaddi\\OneDrive - Capgemini\\Desktop\\Tax\\Sample.txt");
		int k;
		while((k=fr.read())!=-1) {
			System.out.print((char)k);
		}
		fr.close();
		br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
