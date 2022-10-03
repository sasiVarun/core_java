package maccess;
import test.*;
public class InnerInterface1 {
	public static void main(String[] args) {
		/*
		 * SubClass.ITest1 ob1 = new SubClass.ITest1() { public void m1(int x) {
		 * System.out.println("x:"+x); } }; ob1.m1(21);
		 * 
		 * ITest.ITest2 ob2 = new ITest.ITest2() { public void m2(int y) {
		 * System.out.println("y:"+y); } }; ob2.m2(28);
		 * 
		 * AClass.ITest3 ob3 = new AClass.ITest3() { public void m3(int z) {
		 * System.out.println("z:"+z); } }; ob3.m3(2);
		 */

		//Converting above Anonymous InnerClass as Implementation class to LambdaExpression.
		
		SubClass.ITest1 ob1 = (int x) ->
			{
				System.out.println("x:"+x);
			};
		ob1.m1(21);
		
		ITest.ITest2 ob2 = (int y) ->
			{
					System.out.println("y:"+y);				
			};
		ob2.m2(28);
		
		AClass.ITest3 ob3 = (int z) -> 
			{
					System.out.println("z:"+z);
				
			};
		ob3.m3(2);
	}

}
