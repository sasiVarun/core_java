package test;

public class CheckPinNo {
	
	boolean pinStatus = false;
	public boolean verifyPin(int pin) {
		switch(pin) {
		case 1111: pinStatus = true;
			break;
		case 2222: pinStatus = true;
			break;
		case 3333: pinStatus = true;
			break;
		}
		return pinStatus;
	}
}
