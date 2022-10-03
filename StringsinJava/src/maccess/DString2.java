package maccess;

import java.util.Scanner;

public class DString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			System.out.println("Enter the String1:");
			String s1 = sc.nextLine().trim();
			System.out.println("Enter the String2:");
			String s2 = sc.nextLine().trim();
			System.out.println("-------------equals()----------------");
			boolean z = s1.equalsIgnoreCase(s2);
			if(z) {
				System.out.println("Strings are equal...");
			}else {				
				System.out.println("Strings are not equal...");
			}
			System.out.println("-------------compareTo()----------------");
			int k = s1.compareToIgnoreCase(s2);
			
			if(k==0) {
				System.out.println("Strings are equal...");
			}else if(k>0) {
				System.out.println("s1 is greater than s2");
			}else {
				System.out.println("s1 is less than s2");				
			}
		}
	}
}
