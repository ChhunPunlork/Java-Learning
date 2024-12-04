package com.NU.java.Assiment4;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumber {

	public static void main(String[] args) {
		int[] num = { 23, 30, 45, 17, 50 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println("Event number: " + num[i]);
			} else if (num[i] % 2 != 0) {
				System.out.println("Odd number: " + num[i]);
			}
		}

	}

}
