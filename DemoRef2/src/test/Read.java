package test;

import java.util.Scanner;

public class Read {
	public void read(Scanner sc, Student stu) {
		System.out.println("Enter Name: ");
		stu.name = sc.nextLine();
		System.out.println("Enter Branch: ");
		stu.br = sc.nextLine().toUpperCase();
		boolean z = stu.cb.verify(stu.br);
		if (z) {
			System.out.println("Enter Roll No: ");
			stu.rollNo = sc.nextLine();
			if (stu.rollNo.length() == 10) {
				// Address
				System.out.println("Enter HouseNo: ");
				stu.ad.hNo = sc.nextLine();
				System.out.println("Enter Street Name: ");
				stu.ad.sName = sc.nextLine();
				System.out.println("Enter City: ");
				stu.ad.city = sc.nextLine();
				System.out.println("Enter pin code: ");
				stu.ad.pinCode = sc.nextInt();
				
				//Enter Subject Marks
				System.out.println("Enter six Subject marks:");
				int i = 1, p = 0, totMarks = 0;
				while (i <= 6) {
					System.out.println("Enter the Marks of Sub" + i);
					int sub = sc.nextInt();
					i++;
					if (sub < 0 || sub > 100) {
						System.out.println("Invalid markstu...");
						i--;
						continue;// skip the below lines from execution
					}
					if (sub >= 0 && sub <= 34) {
						p = 1;
					}
					totMarks = totMarks + sub;

				} // end of loop

				stu.sr.calcualte(totMarks, p);
			} // end of if
			else {
				System.out.println("Invalid rollNo...");
				System.exit(0);
			}
		} // end of if
		else {
			System.out.println("Invalid branch...");
			System.exit(0);
		}
	}
}
