package maccess;
import test.*;
public class MethodReferences {

	public static void main(String[] args) {
		ITest ob1 = Display :: new; //Reference to Constructor
		ob1.dis(21); //Constructor Body is executed
		
		Display d = new Display(111);
		ITest ob2 = d :: m1; //Reference to Instance Method
		ob2.dis(28); //Instance Body is executed
		
		ITest ob3 = Display :: m2; //Reference to Static Method
		ob3.dis(2); //Static Body is executed
	}

}
