package test;

import java.util.Scanner;

public class Read {
	public Scanner s = null; //Instance Variable
	public Product p = null; //Instance Variable
	
	public Read(Scanner s, Product p) {
		this.s = s;
		this.p = p;
	}

	public void read() {
		System.out.println("Enter the ProCode:");
		 p.pCode=s.nextLine();
		 System.out.println("Enter the ProName:");
		 p.pName=s.nextLine();
		 System.out.println("Enter the ProPrice:");
		 p.pPrice=s.nextLine();
		 System.out.println("Enter the ProQty:");
		 p.pQty=s.nextLine();
	
	}
}
