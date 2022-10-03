package main;
import java.util.*;

import test.Employee;
public class Dtest {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(100);
		e2.setId(100);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1.equals(e2));
		
		
		  Set<Employee> set = new HashSet<>(); 
		  set.add(e1); 
		  set.add(e2);
		  
//		  for(Employee em: emp);{ System.out.println(emp.get); }
		 
//		Set<Integer> set = new HashSet<>();
//		set.add(12);
//		set.add(13);
//		set.add(14);
//		set.add(15);
		
//		set.forEach(k->System.out.println(k));
		for(Employee i : set) {
			System.out.println(i.getId() +" " +i.getName());
		}
		set.forEach(System.out::println);
	}
}
