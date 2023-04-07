package com.bridgelabz.Set;

// using lambda expressions to filter and map the data in the set,
// and then collecting the results into a new set.
// then using the removeIf method, which is a default method introduced in Java 8
// that allows you to remove elements from a collection based on a predicate.
// Finally,using the forEach method to print the remaining elements in the set.

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8HashSetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("John");
		set.add("Mary");
		set.add("Bob");
		set.add("Alice");

		// Using lambda expressions to filter and map the data
		Set<String> filteredSet = set.stream()
				.filter(name -> name.length() > 3)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());

		System.out.println(filteredSet); // [MARY, ALICE]

		// Using default methods to add and remove elements from the set
		set.removeIf(name -> name.startsWith("B"));
		set.forEach(System.out::println); // John, Mary, Alice
	}
}
