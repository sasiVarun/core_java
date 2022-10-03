package maccess;

public class DWrapperClass3 {
	public static void main(String[] args) {
		//Boxing Process
		Integer ob1 = new Integer(12);
		Float ob2 = new Float(21.28F);
		Character ob3 = new Character('A');
		Boolean ob4 = new Boolean(true);
		//Unboxing Process
		int i = ob1.intValue();
		float f = ob2.floatValue();
		char ch = ob3.charValue();
		boolean b = ob4.booleanValue();
		System.out.println("-----Display values-----");
		System.out.println("i:"+i);
		System.out.println("f:"+f);
		System.out.println("ch:"+ch);
		System.out.println("b:"+b);
	}
}
