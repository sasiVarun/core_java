package maccess;

public class DString1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("program");
		String s3 = s1.concat(s2);
		int l1 = s1.length();
		int l2 = s2.length();
		int l3 = s3.length();
		
		System.out.println("s1:"+s1.toString());
		System.out.println("length of s1:"+l1);
		System.out.println("s2:"+s2.toString());
		System.out.println("length of s2:"+l2);
		System.out.println("s3:"+s3.toString());
		System.out.println("length of s3:"+l3);
	}
}
