package maccess;
import test.*;
public class DemoPoly2 {

	public static void main(String[] args) {
		PTest ob = new PTest();
//		ob.m(); //Compilation Error
		ob.dis();//Non-private method call
	}

}
