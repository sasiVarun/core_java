package test;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee emp) {
		
		return this.id - emp.id;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	
	public static Comparator<Employee> nameComparator = (Employee emp1, Employee emp2) -> {
			
			return emp1.getName().compareTo(emp2.getName());
		};
	
	
}
