package com.bridgelabz.Set;

// creating a TreeSet of strings with a custom comparator to sort the elements
// in reverse order. We're then using streams to filter and map the data,
// keeping only the fruits that start with "b" or "c",and converting them to uppercase.
// Finally, using default methods of the TreeSet class to retrieve
// the first and last elements, as well as remove an element from the set.

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Java8TreeSetExample {

	public static void main(String[] args) {

		// Creating a TreeSet of strings with a custom comparator
		Set<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("cherry");
		treeSet.add("durian");
		treeSet.add("elderberry");

		// Using streams to filter and map the data
		Set<String> filteredSet = treeSet.stream()
				.filter(fruit -> fruit.startsWith("b") || fruit.startsWith("c"))
				.map(String::toUpperCase)
				.collect(Collectors.toSet());

		System.out.println(filteredSet); // [CHERRY, BANANA]

		// Using default methods to retrieve and remove elements
		String firstElement = ((TreeSet<String>) treeSet).first();
		String lastElement = ((TreeSet<String>) treeSet).last();
		boolean removed = treeSet.remove("apple");

		System.out.println(firstElement); // elderberry
		System.out.println(lastElement); // apple
		System.out.println(removed); // true
	}
}
