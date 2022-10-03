package test;
@SuppressWarnings("serial")
public class BranchCheck extends Exception{
	public BranchCheck() {}
	public BranchCheck(String msg) {
		super(msg);
	}
	public void verify(String branch) throws BranchCheck
	{
		try {
			switch(branch) {
			case "CSE":
				break;
			case "ECE":
				break;
			case "EEE":
				break;
			default://Exception raised
				BranchCheck bc = new BranchCheck("Invalid branch...");
				throw bc;
			}//end of switch
		}catch(BranchCheck bc) {
			throw bc;//re-throwing process
		}
	}
}
