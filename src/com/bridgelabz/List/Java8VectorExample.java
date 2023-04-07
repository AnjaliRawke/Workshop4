package com.bridgelabz.List;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Java8VectorExample {
	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();
		vector.add("Jayesh");
		vector.add("Mohan");
		vector.add("Bike");
		vector.add("Anjali");

		// Using lambda expressions to filter and map the data
		List<String> filteredList = vector.stream()
				.filter(name -> name.length() > 3)
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(filteredList);

		// Using streams to perform operations on the vector
		boolean allMatch = vector.stream().allMatch(name -> name.length() > 2);
		boolean anyMatch = vector.stream().anyMatch(name -> name.startsWith("J"));

		System.out.println(allMatch); // true
		System.out.println(anyMatch); //true
	}
}
