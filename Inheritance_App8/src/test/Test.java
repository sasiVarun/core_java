package test;

public class Test {
	public Test(int a, int b) {
		this(13,14,15);//Con_Call_Test(int,int,int)
		System.out.println("=== Test(int,int) ===");
		System.out.println("a: "+a+"\nb: "+b);
	}
	public Test(int a, int b, int c) {
		System.out.println("=== Test(int,int,int) ===");
		System.out.println("a: "+a+"\nb: "+b+"\nc: "+c);
	}

}
