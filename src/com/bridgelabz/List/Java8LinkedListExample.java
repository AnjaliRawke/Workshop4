package com.bridgelabz.List;

// using lambda expressions to filter and map the data in the list,
// and then collecting the results into a new list.
// then using streams to perform operations on the list,
// such as checking if all elements are positive (allMatch),
// and if any element equals a certain value (anyMatch).

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8LinkedListExample {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(8);
		list.add(5);

		// Using lambda expressions to filter and map the data
		List<Integer> filteredList = list.stream()
				.filter(number -> number % 2 == 0)
				.map(number -> number * 2)
				.collect(Collectors.toList());

		System.out.println(filteredList); // [16]

		// Using streams to perform operations on the list
		boolean allMatch = list.stream().allMatch(number -> number > 0);
		boolean anyMatch = list.stream().anyMatch(number -> number == 7);

		System.out.println(allMatch); // true
		System.out.println(anyMatch); // true
	}
}
