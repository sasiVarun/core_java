package maccess;
import test.*;
public class DemoPoly3 {

	public static void main(String[] args) {
//		Test1 ob = new Test1();//Con_Call //Compilation Error
		Test1 ob = Test1.getRef(); //Accessing Object reference
		ob.dis(28);
	}

}
