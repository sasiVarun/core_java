package maccess;

import java.util.InputMismatchException;
import java.util.Scanner;
import test.*;

@SuppressWarnings("serial")
public class DInterface3 extends Exception {
	public DInterface3(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			int wrongEntry = 1;

			whileLoopLabel: while (wrongEntry <= 3) {
				try {
					System.out.println("Enter the PIN No:");
					int pin = sc.nextInt();
					CheckPinNo cp = new CheckPinNo();
					cp.verifyPin(pin);

					System.out.println("=== Choice ===");
					System.out.println("1. Withdraw\n2. Deposit");
					int choice = sc.nextInt();
					int amount;
					switch (choice) {
					case 1:// Withdraw
						System.out.println("Enter withdraw amount:");
						amount = sc.nextInt();

						if (!(amount > 0 && amount % 100 == 0))// Exception
						{
							DInterface3 ob = new DInterface3("Invalid amount...");
							throw ob;// throwing reference to catch block
						}

						Withdraw wd = new Withdraw();
						wd.process(amount);
						break whileLoopLabel;

					case 2:// Deposit
						System.out.println("Enter Deposit amount:");
						amount = sc.nextInt();

						if (!(amount > 0 && amount % 100 == 0)) {
							DInterface3 ob = new DInterface3("Invalid amount...");
							throw ob;// throwing reference to catch block
						}

						Deposit d = new Deposit();
						d.process(amount);
						break whileLoopLabel;

					default:
						DInterface3 ob = new DInterface3("Invalid Choice...");
						throw ob;

					}

				} // end of try
				catch (DInterface3 | Withdraw | CheckPinNo | InputMismatchException ob) {
					if(ob.getMessage()==null) {
						System.out.println("Only Integer values");
						break whileLoopLabel;
					}
					System.out.println(ob.getMessage());

					if (ob.getMessage().equals("Invalid Pin No...")) {
						wrongEntry++;
						if(wrongEntry>3) {
							System.out.println("Transaction Blocked temporarily....");
							break whileLoopLabel;
						}
						continue;//skip below lines
					}
					break whileLoopLabel;
				}
				
			} // end of loop
		} // End of try-with-resource
	}
}