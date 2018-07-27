package constructor;

public class Person {

	String name;
	int age;
	String job;

	// Constructor has same name with class

	public Person() { // Constructor with no argument
		job = "programmer";
		System.out.println("Calling Constructor with no argument");
	}

	public Person(String pName) { // Constructor with one argument

		System.out.println("Calling Constructor with one argument");
	}

	public Person(String name, int age, String job) {
		// this keyword can only be used in CONSTRUCTOR
		// *************************************
		// and instance method
		this.name = name;
		this.age = age;
		this.job = job;

		System.out.println("Calling Constructor 3 arguments");

	}

}
