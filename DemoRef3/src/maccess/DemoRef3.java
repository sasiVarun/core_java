package maccess;
import java.util.Scanner;
import test.*;
import test.*;
public class DemoRef3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		Read r = new Read(sc,p); //Con_Call_with_Parameters
		r.read();
		Display d = new Display(p); //Con_Call_with_Parameters
		d.disp();
		
	}

}
