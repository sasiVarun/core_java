package maccess;
import test.*;
public class Anonymous1 {

	public static void main(String[] args) {
		PClass ob = new PClass()
		{
			public void m1(int x) {
				System.out.println("=== Child Class m1()====");
				System.out.println("x: "+x);
			}//Overriding method
			public void m3(int z) {
				System.out.println("=== Child Class m3()====");
				System.out.println("z: "+z);
			}
		};
		ob.m1(21);
		ob.m2(28);
//		ob.m3(2); //Compilation_Erro
		
		
	}

}
