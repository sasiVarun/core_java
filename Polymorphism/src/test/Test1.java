package test;

public class Test1 {
	private static Test1 ob = null;
	private Test1() {}
	static {
		ob = new Test1();//Con_Call
	}
	public static Test1 getRef() {
		return ob;
	}
	public void dis(int z) {
		System.out.println("Method dis()");
		System.out.println("Value z:"+z);
	}
}
