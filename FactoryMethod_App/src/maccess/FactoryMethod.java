package maccess;

import java.util.Scanner;

import test.*;

public class FactoryMethod {

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
		if(choice == 1 ||choice == 2 ||choice == 3 ||choice == 4 ||choice == 5) {
			IArithmetic rs = Result.getResult(choice);//Create object & returns the object reference
			System.out.println("Result: "+rs.process(v1,v2));
		} else {
			System.out.println("Invalid Choice...");
		}
		
		
		
	}

}
