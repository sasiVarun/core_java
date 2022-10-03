package test;

public interface Transaction {
	public Balance b = new Balance();
	
	public void process(int amt) throws Withdraw;

}
