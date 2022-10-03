package maccess;
import java.util.Scanner;
import test.*;
public class LambdaExpression4 {

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
							Transaction wd = (int amt) ->
							{
									
									if(amt<=Transaction.b.bal) {
										System.out.println("Amount Withdrawn:"+ amt);
										Transaction.b.bal = Transaction.b.bal - amt;
										Transaction.b.getBalance();
										System.out.println("Transaction Completed...");
									} else {
										System.out.println("Insufficient funds....");
									}
									
							};
							wd.process(amount);
					} else {
						System.out.println("Entered Invalid amount for withdraw...");
					}
					break whileLoopLabel;
				case 2:
					System.out.println("Enter Deposit amount:");
					amount = sc.nextInt();
					if(amount>0 && amount%100 == 0) {
						Transaction d = (int amt) ->
						{
								System.out.println("Amount Deposited:"+ amt);
								Transaction.b.bal = Transaction.b.bal + amt;
								Transaction.b.getBalance();
								System.out.println("Transaction Completed...");
						};
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
