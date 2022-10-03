package test;

public interface ITest { //Functional Interface
	public default void m1(int x) {
		System.out.println("===Default Concrete Method===");
		System.out.println("The value x: "+x);
	}
	
	public abstract void m2(int y);	
}
