package test;

public interface ITest {
	public static class SubClass2 {
		public static void m2(int x) {
			System.out.println("===ITest m2()===");
			System.out.println("x: "+x);
		}
		public void m22(int y) {
			System.out.println("===ITest m22()===");
			System.out.println("y: "+y);
		}
	}//InnerClass
}//Outer Interface