package test;

public class Printer {
	public void print(int n, String name) {
		for(int i=1;i<=n;i++) {
			System.out.println("Print for "+name);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}//end of loop
	}
}
