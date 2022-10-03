package test;

@SuppressWarnings("serial")
public class CheckPinNo extends Exception {
	public CheckPinNo() {}
	public CheckPinNo(String msg) {
		super(msg);
	}
	public void verifyPin(int pin) throws CheckPinNo
	{
		try {
			switch(pin) {
			case 1111: 
				break;
			case 2222: 
				break;
			case 3333: 
				break;
			default://raise the exception
				CheckPinNo cpn = new CheckPinNo("Invalid Pin No...");
				throw cpn;
			}//end of switch
		}//end of try
		catch(CheckPinNo cpn) {
			throw cpn;
		}
	}
}
