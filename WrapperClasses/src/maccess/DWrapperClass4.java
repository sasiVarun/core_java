package maccess;

public class DWrapperClass4 {
	public static void main(String[] args) {
		//Boxing Process
		Integer ob1 = new Integer(12);
		Float ob2 = new Float(21.28F);
		Character ob3 = new Character('A');
		Boolean ob4 = new Boolean(true);
		//AutoUnboxing Process
		int i = ob1;
		float f = ob2;
		char ch = ob3;
		boolean b = ob4;
		System.out.println("-----Display values-----");
		System.out.println("i:"+i);
		System.out.println("f:"+f);
		System.out.println("ch:"+ch);
		System.out.println("b:"+b);
	}
}
