package com.bridgelabz.Set;

// using lambda expressions to filter and map the data in the set,
// and then collecting the results into a new set.
// also using the removeIf method, which is a default method introduced in Java 8
// that allows you to remove elements from a collection based on a predicate.
// Finally, using the forEach method to print the remaining elements in the set.

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8LinkedHashSetExample {
	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();
		set.add(3);
		set.add(7);
		set.add(1);
		set.add(8);
		set.add(5);

		// Using lambda expressions to filter and map the data
		Set<Integer> filteredSet = set.stream()
				.filter(number -> number % 2 == 0)
				.map(number -> number * 2)
				.collect(Collectors.toSet());

		System.out.println(filteredSet); // [16]

		// Using default methods to add and remove elements from the set
		set.removeIf(number -> number == 3);
		set.forEach(System.out::println); // 7, 1, 8, 5
	}
}
