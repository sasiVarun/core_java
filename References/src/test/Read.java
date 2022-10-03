package test;

import java.util.*;

public class Read {
	public void read(Scanner sc, Employee e) {
		System.out.println("Enter EmpID: ");
		e.empID = sc.nextLine();
		System.out.println("Enter EmpName: ");
		e.empName = sc.nextLine();
		System.out.println("Enter EmpDesg: ");
		e.empDesg = sc.nextLine();
		System.out.println("Enter HouseNo: ");
		e.ad.hNo = sc.nextLine();
		System.out.println("Enter Street Name: ");
		e.ad.sName = sc.nextLine();
		System.out.println("Enter City: ");
		e.ad.city = sc.nextLine();
		System.out.println("Enter pin code: ");
		e.ad.pinCode = sc.nextInt();
		
	}

}
