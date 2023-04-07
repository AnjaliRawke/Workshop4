package com.bridgelabz.List;

//using lambda expressions to filter and map the data in the list,
// and then collecting the results into a new list.
// then using a method reference to sort the data in the original list.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Anjali");
		list.add("Mahesh");
		list.add("Apeksha");
		list.add("Vaishnavi");

		// Using lambda expressions to filter and map the data
		List<String> filteredList = list.stream()
				.filter(name -> name.startsWith("M"))
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(filteredList);

		// Using method references to sort the data
		list.sort(String::compareToIgnoreCase);

		System.out.println(list);
	}
}

