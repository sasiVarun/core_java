package maccess;

import java.util.Scanner;
import test.*;

public class DemoRef1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		Read r = new Read();
		r.read(sc, e);
		Display d = new Display();
		d.display(e);

	}

}
