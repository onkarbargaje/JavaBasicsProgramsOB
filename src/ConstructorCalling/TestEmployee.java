package ConstructorCalling;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e= new Employee("Tom");
		System.out.println(e.age);
        System.out.println(e.name);

	}

}
