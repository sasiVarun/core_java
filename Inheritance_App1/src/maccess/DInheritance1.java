package maccess;
import test.*;

public class DInheritance1 {

	public static void main(String[] args) {
		B ob = new B();//Object created to hold members of PClass & CClass
		ob.a = 12;
		ob.b = 13;
		ob.m1(); // Parent Class method call
		ob.m2(); // Child Class method call

	}

}
