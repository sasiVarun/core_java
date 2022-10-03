package maccess;
import test.*;
public class DInheritance9 {

	public static void main(String[] args) {
		Display.m(1, 5);
		Display.m(12, 13.79F);
		DInheritance9.main(9.8f);
		System.out.println("Standard main() method");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	public static void main(float k) {
		System.out.println("Overloaded main() method");
		System.out.println(k);
	}
	
	
}
