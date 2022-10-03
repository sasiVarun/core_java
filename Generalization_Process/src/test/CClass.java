package test;

public class CClass extends PClass{
	public void m1(int x) {
		System.out.println("=== Child Class m1()====");
		System.out.println("x: "+x);
	}//Overriding method
	public void m3(int z) {
		System.out.println("=== Child Class m3()====");
		System.out.println("z: "+z);
	}
}
