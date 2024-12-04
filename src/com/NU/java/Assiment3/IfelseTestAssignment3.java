package com.NU.java.Assiment3;

import java.util.Scanner;

public class IfelseTestAssignment3 {
	public static void main(String[] args) {
//		int score = 20;
//		
//		if(score <= 100 && score >= 95) {
//			grade = 'A';
//			System.out.println("Score: " + score + " is grade: " + grade);
//		}else if(score <=94 && score >=93) {
//			grade = 'B';
//			System.out.println("Score: " + score + " is grade: " + grade);
//		}else if(score <=82 && score >=70) {
//			grade = 'B';
//			System.out.println("Score: " + score + " grade: " + grade);
//		}else if(score < 70) {
//			grade = 'F';
//			System.out.println("Score: " + score + " is grade: " + grade);
//		}
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		char grade;
		
		while(true) {
			System.out.println("========================");
			System.out.println("1. to input score");
			System.out.println("2. to exit");
			System.out.print("Option: ");
			int optionNum = sc.nextInt();
			System.out.println("========================");
			if(optionNum == 1) {
				System.out.print("Input score: ");
				int score = sc.nextInt();
				if(score <= 100 && score >= 95) {
					grade = 'A';
					System.out.println("Score: " + score + " is grade: " + grade);
				}else if(score <=94 && score >=93) {
					grade = 'B';
					System.out.println("Score: " + score + " is grade: " + grade);
				}else if(score <=82 && score >=70) {
					grade = 'B';
					System.out.println("Score: " + score + " grade: " + grade);
				}else if(score < 70) {
					grade = 'F';
					System.out.println("Score: " + score + " is grade: " + grade);
				}
			}else if(optionNum == 2) {
				exit = false;
				break;
			}
		}
		
	}
}
