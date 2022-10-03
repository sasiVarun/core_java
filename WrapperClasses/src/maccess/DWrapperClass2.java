package maccess;

public class DWrapperClass2 {
	public static void main(String[] args) {
		Byte ob1 = (byte)123;
		Short ob2 = (short)123;
		Integer ob3 = 123;
		Float ob4 = 12.45F;
		Double ob5 = 366.67;
		Long ob6 = 3445666L;		
		Character ob7 = 'A';
		Boolean ob8 = true;
		
		System.out.println("-------Displaying Wrapper Class Objects---------------");
		System.out.println("ob1: "+ob1.toString());
		System.out.println("ob2: "+ob2.toString());
		System.out.println("ob3: "+ob3.toString());
		System.out.println("ob4: "+ob4.toString());
		System.out.println("ob5: "+ob5.toString());
		System.out.println("ob6: "+ob6.toString());
		System.out.println("ob7: "+ob7.toString());
		System.out.println("ob8: "+ob8.toString());
	}
}
