package ConstructorCalling;

public class Car {
	String brand;
	String type;
	int capacity;
	
	public Car(String brand, String type, int capacity) {
		System.out.println("this is car parameterised construct-----");
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}
	
	public Car()
	{
		System.out.println("this is car default const----");
	}
	

}
