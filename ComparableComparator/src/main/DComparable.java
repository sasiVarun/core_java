package main;
import java.util.Arrays;
import test.Employee;

public class DComparable {
	public static void main(String... args) {
		Employee[] emp = new Employee[4];
		
		emp[0] = new Employee(101,"Sam");
		emp[1] = new Employee(88,"Eric");
		emp[2] = new Employee(97,"David");
		emp[3] = new Employee(66,"Blake");
		
		Arrays.sort(emp);
		System.out.println("After Sorting\n"+ Arrays.toString(emp));
		Arrays.sort(emp, Employee.nameComparator);
		System.out.println("After Sorting\n"+ Arrays.toString(emp));
	}
}
