package com.NU.java.Assiment3;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		int score = 89;
		char grade;
		if(score <= 100 && score >= 95) {
			grade = 'A';
			System.out.println("Student grade: " + grade);
		}else if(score <= 94 && score >= 83) {
			grade = 'B';
			System.out.println("Student grade: " + grade);
		}else if(score <= 82 && score >= 71) {
			grade = 'C';
			System.out.println("Student grade: " + grade);
		}else if(score <= 70){
			grade = 'F';
			System.out.println("Student grade: " + grade);
		}
		
	}

}
