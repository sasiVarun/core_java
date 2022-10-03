package test;

public class Student {
	public String name, br, rollNo;
	public Address ad = new Address(); // reference variable
	public CheckBranch cb = new CheckBranch();
	
	public StudentResult sr = new StudentResult();
	
	public void getStudent() {
		System.out.println("===Student Details===");
		System.out.println("Name: "+name);
		System.out.println("Branch: "+br);
		System.out.println("Roll Number: "+rollNo);
	}


}
