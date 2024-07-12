package ConstructorCalling;

public class Employee {

	String name;
	int age;
	String city;
	
	
	public Employee(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Employee(String name, int age) {
		this("Kirti",26,"Barshi");		
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name) {
		this("Kirti",26);
		this.name = name;
	}

	

}
