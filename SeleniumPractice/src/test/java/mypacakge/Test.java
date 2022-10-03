package mypacakge;

import java.net.URL;

public class Test {

	public static void main(String[] args) {
		
		Test a = new Test();
		URL b = Test.class.getResource("/");
		String c = Test.class.getResource("/").getFile();
		System.out.println("Print resource: " + b);
		System.out.println("Print resource: " + c);

	}

}
