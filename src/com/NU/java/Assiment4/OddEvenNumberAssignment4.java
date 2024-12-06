package com.NU.java.Assiment4;

public class OddEvenNumberAssignment4 {

	public static void main(String[] args) {
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
		System.out.print("Array: ");
		for(int i = 0; i < nums.length;i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();
		System.out.println("Even number: " + even);
		System.out.println("Odd number: " + odd);
	}

}
