package com.NU.java.Assiment4;

import java.util.List;

public class ListOfOddAndEvenNumber {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(17, 25, 32, 46, 50);
		
//		numbers.stream()
//		.filter(n -> n % 2 == 0)
//		.forEach(System.out::println);
		
		for(int n : numbers) {
			System.out.print(n + ", ");
		}
	}
}
