package maccess;

import java.util.Scanner;
import test.*;

public class DemoRef2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		Read r = new Read();
		r.read(sc, stu);
		Display d = new Display();
		d.display(stu);
		sc.close();

	}

}
