package maccess;
import test.*;
public class DInnerClass1 {

	public static void main(String[] args) {
		SubClass1 ob1 = new SubClass1();//OuterClass object
		ob1.m1();//OuterClass method_call
		
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2();//Static member InnerClass_object
		SubClass1.SubClass2.m2();
		ob2.m22();
		
		SubClass1.SubClass3 ob3 = ob1.new SubClass3();//Non-Static member InnerClass_object
		SubClass1.SubClass3.m3();
		ob3.m33();
	}

}
