package com.practics.set.java.java8practics;


//To create an immutable class in Java, you need to follow these general principles:

//Declare the class as final so it can’t be extended.
//Make all of the fields private so that direct access is not allowed.
//Don’t provide setter methods for variables.
//Make all mutable fields final so that a field’s value can be assigned only once.
//Initialize all fields using a constructor method performing deep copy.
//Perform cloning of object
public final class immutableClass {
	
	private final String data;
	
	public immutableClass(String data) {
		this.data = data;
	}
	
	String getData() {
		return data;
	}

	public static void main(String[] args) {
		immutableClass a = new immutableClass("Java");
		System.out.println(a.getData());
	}
}
