package com.NU.java.Assiment7;

public class Student extends Person {
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student(String firstName, String lastName, int id) {
		super(firstName, lastName);
		this.grade = id;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", FirstName: " + getFirstName() + ", LastName: " + getLastName()
				+ "]";
	}
	
	public static void main(String[] args) {
		Student student = new Student("Chhun", "Punlork", 12);
		System.out.println(student);
	}

}
