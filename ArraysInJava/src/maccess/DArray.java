package maccess;
import test.*;
import java.util.*;
public class DArray {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		try(sc;){
			try {
				System.out.println("Enter the number of Products");
				int n = Integer.parseInt(sc.nextLine());
				
				Product p[] = new Product[n];
				
				System.out.println("Enter "+n+" products");
				
				for(int i = 0; i<n;i++) {
					System.out.println("******Enter "+(i+1)+" product details******");
					System.out.println("Enter Product Code");
					String pCode = sc.nextLine();
					System.out.println("Enter Product Name");
					String pName = sc.nextLine();
					System.out.println("Enter Product Price");
					float pPrice = Float.parseFloat(sc.nextLine());
					System.out.println("Enter Product Quantity");
					int pQty = Integer.parseInt(sc.nextLine());
					
					p[i] = new Product(pCode,pName,pPrice,pQty);					
				}//end of loop
				
				System.out.println("******Displaying Products******");
				for(int i = 0; i<p.length;i++) {
					System.out.println(p[i].toString());
				}
				for(Product pr : p) {
					System.out.println(pr.toString());
				}
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
