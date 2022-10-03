package test;

public class SubClass1 {
	public int a = 10;
	public static int b = 20;

	public void m1() {
		System.out.println("=====OuterClass m1()=====");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		class SubClass4 {
			public static void m4() {
				System.out.println("===Local InnerClass m4()===");
//				System.out.println("a:"+a);  //Compilation_Error
				System.out.println("b: " + b);
			}
			public void m44() {
				System.out.println("===Local InnerClass m44()===");
				System.out.println("a:" + a);
				System.out.println("b: " + b);
			}
		}//Local InnerClass
		
		SubClass4 ob4 = new SubClass4(); //Local InnerClass Object
		SubClass4.m4();
		ob4.m44();
	}// OuterClass method

	public static class SubClass2 {
		public static void m2() {
			System.out.println("===Static member InnerClass m2()===");
//			System.out.println("a:"+a);  //Compilation_Error
			System.out.println("b: " + b);
		}

		public void m22() {
			System.out.println("===Static member InnerClass m22()===");
//			System.out.println("a:"+a);  //Compilation_Error
			System.out.println("b: " + b);
		}
	}// Static member InnerClass

	public class SubClass3 {
		public static void m3() {
			System.out.println("===Non-Static member InnerClass m3()===");
//			System.out.println("a:"+a);  //Compilation_Error
			System.out.println("b: " + b);
		}

		public void m33() {
			System.out.println("===Non-Static member InnerClass m33()===");
			System.out.println("a:" + a);
			System.out.println("b: " + b);
		}

	}// NonStatic member InnerClass
}// OuterClass
