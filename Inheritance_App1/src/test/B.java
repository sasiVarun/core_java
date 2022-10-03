package test;

public class B extends A{
	public int b;
	public void m2() {
		System.out.println("=== Child Class ====");
		System.out.println("The value b: "+b);
	}
	
	{
		System.out.println("Child Class Instance Block..."); // Instance block
	}

}
