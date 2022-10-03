package maccess;

public class DTypeCast1 {
	
	public static void main(String[] args) {
		char ch = 'A';
		int k = (int) ch; // Widening Process
		int z = 86;
		char ch2 = (char) k;// Narrowing process
		System.out.println("ASCII value of A:" + k);
		System.out.println("Char value at 86:" + ch2);

		for (int i = 97; i <= 122; i++) {
			System.out.print((char) i);
		}
	}

}
