package test;

public class A {
	public int a;
	public void m1() {
		System.out.println("=== Parent Class ====");
		System.out.println("The value a: "+a);
	}
	
	{
		System.out.println("ParentClass Instance Block..."); // Instance block
	}

}
