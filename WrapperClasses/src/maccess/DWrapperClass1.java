package maccess;

public class DWrapperClass1 {
	public static void main(String[] args) {
		Byte ob1 = new Byte((byte)123);
		Short ob2 = new Short((short)123);
		Integer ob3 = new Integer(123);
		Integer ob4 = new Integer("124");
		Float ob5 = new Float(12.45F);
		Float ob6 = new Float(126.75);
		Float ob7 = new Float("506.75");
		Double ob8 = new Double(366.67);
		Double ob9 = new Double("77.34");
		Long ob10 = new Long(3445666L);
		Long ob11 = new Long("98889");
		Character ob12 = new Character('A');
		Boolean ob13 = new Boolean(true);
		Boolean ob14 = new Boolean("false");
		
		System.out.println("-------Displaying Wrapper Class Objects---------------");
		System.out.println("ob1: "+ob1.toString());
		System.out.println("ob2: "+ob2.toString());
		System.out.println("ob3: "+ob3.toString());
		System.out.println("ob4: "+ob4.toString());
		System.out.println("ob5: "+ob5.toString());
		System.out.println("ob6: "+ob6.toString());
		System.out.println("ob7: "+ob7.toString());
		System.out.println("ob8: "+ob8.toString());
		System.out.println("ob9: "+ob9.toString());
		System.out.println("ob10: "+ob10.toString());
		System.out.println("ob11: "+ob11.toString());
		System.out.println("ob12: "+ob12.toString());
		System.out.println("ob13: "+ob13.toString());
		System.out.println("ob14: "+ob14.toString());
	}
}
