package maccess;

import test.*;

public class DInnerClass2 {

	public static void main(String[] args) {
		ITest.SubClass2 ob2 = new ITest.SubClass2();
		ITest.SubClass2.m2(21);
		ob2.m22(28);
		
		AClass.SubClass3 ob3 = new AClass.SubClass3();
		AClass.SubClass3.m3(28);
		ob3.m33(21);
	}

}
