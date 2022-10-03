package test;

public class DArrays {
	public static void main(String... args) {
		Integer a1[] = {10,11,12};
		Integer a2[] = {13,14,15,16};
		Integer a3[] = {17,18,19,20,21};
		Integer a[][] = {a1,a2,a3};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Printing elements of array a"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
