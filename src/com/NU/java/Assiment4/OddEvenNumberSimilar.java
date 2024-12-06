package com.NU.java.Assiment4;

public class OddEvenNumberSimilar {

	public static void main(String[] args) {
		int[] nums = { 23, 30, 45, 17, 50 };

		System.out.print("Number in the Array: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.print("\n\n Event number: ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.print(nums[i] + " ");
			}
		}

		System.out.print("\n\n Odd number: ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				System.out.print(nums[i] + " ");
			}
		}
	}

}
