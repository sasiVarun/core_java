package maccess;
import java.util.Scanner;
import test.*;
public class DInterface3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wrongEntry = 1;
		
		whileLoopLabel:
		while(wrongEntry<=3) {
			System.out.println("Enter the PIN No:");
			int pin = sc.nextInt();
			CheckPinNo cp = new CheckPinNo();
			boolean validPin = cp.verifyPin(pin);
			
			if(validPin) {
				System.out.println("=== Choice ===");
				System.out.println("1. Withdraw\n2. Deposit");
				int choice = sc.nextInt();
				int amount;
				switch(choice) {
				case 1:
					System.out.println("Enter withdraw amount:");
					amount = sc.nextInt();
					if(amount>0 && amount%100 == 0) {
							Withdraw wd = new Withdraw();
							wd.process(amount);
					} else {
						System.out.println("Entered Invalid amount for withdraw...");
					}
					break whileLoopLabel;
				case 2:
					System.out.println("Enter Deposit amount:");
					amount = sc.nextInt();
					if(amount>0 && amount%100 == 0) {
						Deposit d = new Deposit();
						d.process(amount);
						} else {
						System.out.println("Entered Invalid amount for deposit...");
					}
					break whileLoopLabel;
				default: System.out.println("Invalid Choice...");
					break whileLoopLabel;
				}
			} else {
				System.out.println("Entered Wrong PIN...");
				wrongEntry++;
			}
		}
		if(wrongEntry > 3) {
			System.out.println("Transaction Blocked temporarily....");
		}
	}

}
