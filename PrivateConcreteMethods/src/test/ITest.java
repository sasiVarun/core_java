package test;
public interface ITest {
	private void m1(int x) {
		System.out.println("===Non-Static Private Concrete Method m1()===");
		System.out.println("x:"+x);
	}
	
	private static void m2(int y) {
		System.out.println("===Static Private Concrete Method m2()===");
		System.out.println("y:"+y);
	}
	
	public default void dis(int x, int y) {
		this.m1(x);
		ITest.m2(y);
	}
	
	public abstract void m3(int z);
}
