package test;

public abstract class AClass {
	public static class SubClass3{
		public static void m3(int j) {
			System.out.println("===AClass m3()===");
			System.out.println("j: "+j);
		}
		public void m33(int k) {
			System.out.println("===AClass m33()===");
			System.out.println("k: "+k);
		}
	}//InnerClass
}//Outer Abstract Class
