package test;

public class PTest {
	private int k= 10;
	private void m() {
		System.out.println("====Private m()===");
		System.out.println("The value k:"+k);
	}
	public void dis() {
		this.m();
	}
}
