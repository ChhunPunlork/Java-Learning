package com.NU.java.Assiment6;

public class Student extends Person{

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public static void main(String[] args) {
		Student student = new Student("Chhun", "Punlork");
		System.out.println(student);
	}

}
