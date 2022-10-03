package test;

public class Employee {
	public String empID, empName, empDesg;
	public Address ad = new Address(); // reference variable
	
	public void getEmployee() {
		System.out.println("===Address===");
		System.out.println("empID: "+empID);
		System.out.println("empName: "+empName);
		System.out.println("empDesg: "+empDesg);
	}

}
