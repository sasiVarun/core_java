package test;

public class SubClass1 {
	public  int a=10;
	public static int b=20;
	public void m1() {
		System.out.println("=====OuterClass m1()=====");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}//OuterClass method
	public static class SubClass2 {
		public static void m2() {
			System.out.println("===Static member InnerClass m2()===");
//			System.out.println("a:"+a);  //Compilation_Error
			System.out.println("b: "+b);
		}
		public void m22() {
			System.out.println("===Static member InnerClass m22()===");
//			System.out.println("a:"+a);  //Compilation_Error
			System.out.println("b: "+b);
		}
	}//Static member InnerClass
	public class SubClass3 {
		public static void m3() {
			
		}
		
		public void m33() {
			
		}
		
	}//NonStatic member InnerClass
}//OuterClass
