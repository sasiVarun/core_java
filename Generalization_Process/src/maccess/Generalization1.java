package maccess;
import test.*;
public class Generalization1 {

	public static void main(String[] args) {
		PClass ob = new CClass(); //Generalization_Syntax
		ob.m1(21);
		ob.m2(28);
//		ob.m3(2);//CompilationError
		
	}

}
