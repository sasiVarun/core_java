package test;

public class Result {

	public static IArithmetic getResult(int choice) {

		IArithmetic ob = null;
		switch (choice) {
		case 1:
			ob = (int x, int y) -> x + y;
			break;
		case 2:
			ob = (int x, int y) -> x - y;
			break;
		case 3:
			ob = (int x, int y) -> x * y;
			break;
		case 4:
			ob = (int x, int y) -> (float) x / y;
			break;
		case 5:
			ob = (int x, int y) -> x % y;
			break;
		}
		return ob;

	}
}