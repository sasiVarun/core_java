package maccess;
import test.*;
public class Demo2 {
	public static void main(String[] args) {
		ITest ob = (int y) ->
		{
				System.out.println("===Abstract method===");
				System.out.println("The value of y:"+y);
		};
		ob.m1(21);
		ob.m2(28);
	}

}
