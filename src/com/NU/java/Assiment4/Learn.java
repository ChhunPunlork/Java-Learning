package com.NU.java.Assiment4;

import java.util.Iterator;
import java.util.Scanner;

public class Learn {
	public static void main(String[] args) {
		// switch branch
//		char operator = '+';
//		int first = 8;
//		int second = 0;
//		switch (operator) {
//		case '+':
//			System.out.println(Math.addExact(first, second));
//			break;
//		case '-':
//			System.out.println(Math.subtractExact(first, second));
//			;
//			break;
//		case '*':
//			System.out.println(Math.multiplyExact(first, second));
//			;
//			break;
//		case '/':
//			System.out.println(Math.divideExact(first, second));
//			;
//			break;
//		default:
//		}
		
		int[] nums = { 23, 30, 45, 17, 50 };
		String even = "";
		String odd = "";
				;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				even += nums[i] + " ";
			}else  {
				odd += nums[i] + " ";
			}
		}
		System.out.println("Even number: " + even);
		System.out.println("Odd number: " + odd);
	}
}
