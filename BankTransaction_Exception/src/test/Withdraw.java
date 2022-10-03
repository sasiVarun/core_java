package test;
@SuppressWarnings("serial")
public class Withdraw extends Exception implements Transaction {
	public Withdraw() {}
	
	public Withdraw(String msg) {
		super(msg);
	}
	public void process(int amt) throws Withdraw 
	{
		try 
		{
			if(amt>b.bal) //raise Exception
			{
				Withdraw wd = new Withdraw("Insufficient funds....");
				throw wd;
			}
			System.out.println("Amount Withdrawn:"+ amt);
			b.bal = b.bal - amt;
			b.getBalance();
			System.out.println("Transaction Completed...");
		}//end of try
		catch(Withdraw wd) {
			throw wd;
		}
	}
}