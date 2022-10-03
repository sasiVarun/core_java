package maccess;

import java.util.Scanner;

import test.*;

public class LambdaExpression2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value v1 ");
		int v1 = sc.nextInt();
		System.out.println("Enter the value v2 ");
		int v2 = sc.nextInt();
		System.out.println("===Choice===");
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod");
		System.out.println("Enter the Choice:");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			IArithmetic ad = (int x, int y) -> x+y;
			System.out.println("Sum: "+ad.process(v1, v2));
			break;
		case 2:
			IArithmetic sb =(int x, int y) -> x-y;
			System.out.println("Sub: "+sb.process(v1, v2));
			break;
		case 3:
			IArithmetic mp = (int x, int y) -> x*y;
			System.out.println("Mul: "+mp.process(v1, v2));
			break;
		case 4:
			IArithmetic dv = (int x, int y) -> (float)x/y;
			System.out.println("Div: "+dv.process(v1, v2));
			break;
		case 5:
			IArithmetic md = (int x, int y) -> x/y;
			System.out.println("Mod: "+md.process(v1, v2));
			break;
		}
		
		/*
		 * switch(choice) { case 1: Addition ad = new Addition();
		 * System.out.println("Sum: "+ad.process(v1, v2)); break; case 2: Subtraction sb
		 * = new Subtraction(); System.out.println("Sub: "+sb.process(v1, v2)); break;
		 * case 3: Multiplication mp = new Multiplication();
		 * System.out.println("Mul: "+mp.process(v1, v2)); break; case 4: Division dv =
		 * new Division(); System.out.println("Div: "+dv.process(v1, v2)); break; case
		 * 5: Modulo md = new Modulo(); System.out.println("Mod: "+md.process(v1, v2));
		 * break; }
		 */
		
		/*
		 * switch(choice) { case 1: IArithmetic ad = new Addition();
		 * System.out.println("Sum: "+ad.process(v1, v2)); break; case 2: IArithmetic sb
		 * = new Subtraction(); System.out.println("Sub: "+sb.process(v1, v2)); break;
		 * case 3: IArithmetic mp = new Multiplication();
		 * System.out.println("Mul: "+mp.process(v1, v2)); break; case 4: IArithmetic dv
		 * = new Division(); System.out.println("Div: "+dv.process(v1, v2)); break; case
		 * 5: IArithmetic md = new Modulo(); System.out.println("Mod: "+md.process(v1,
		 * v2)); break; }
		 */
		
		/*
		 * switch(choice) { case 1: IArithmetic ad = new IArithmetic() { public float
		 * process(int x, int y) { return x+y; } };
		 * System.out.println("Sum: "+ad.process(v1, v2)); break; case 2: IArithmetic sb
		 * = new IArithmetic() { public float process(int x, int y) { return x-y; } };
		 * System.out.println("Sub: "+sb.process(v1, v2)); break; case 3: IArithmetic mp
		 * = new IArithmetic() { public float process(int x, int y) { return x*y; } };
		 * System.out.println("Mul: "+mp.process(v1, v2)); break; case 4: IArithmetic dv
		 * = new IArithmetic() { public float process(int x, int y) { return x/y; } };
		 * System.out.println("Div: "+dv.process(v1, v2)); break; case 5: IArithmetic md
		 * = new IArithmetic() { public float process(int x, int y) { return x%y; } };
		 * System.out.println("Mod: "+md.process(v1, v2)); break; }
		 */
		
		
	}

}
