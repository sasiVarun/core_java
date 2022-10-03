package maccess;
import test.*;
public class Demo3 {
	public static void main(String[] args) {
		ITest ob = (int z) -> {
				System.out.println("===m3()====");
				System.out.println("z:"+z);
			};
		ob.dis(21, 28);
		ob.m3(2);

	}

}
