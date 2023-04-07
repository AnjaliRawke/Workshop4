package com.bridgelabz.Deque;

// creating an ArrayDeque of integers and using streams to filter and map the data,
// keeping only the even numbers and converting them to a string separated by commas.
// then using default methods of the ArrayDeque class to retrieve the first and last
// element, as well as pop an element from the deque.

import java.util.ArrayDeque;
import java.util.stream.Collectors;

public class Java8ArrayDequeExample {
	public static void main(String[] args) {

		// Creating an ArrayDeque of integers
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		arrayDeque.push(10);
		arrayDeque.push(20);
		arrayDeque.push(30);
		arrayDeque.push(40);
		arrayDeque.push(50);

		// Using streams to filter and map the data
		String filteredString = arrayDeque.stream()
				.filter(number -> number % 2 == 0)
				.map(Object::toString)
				.collect(Collectors.joining(", "));

		System.out.println(filteredString); // "50, 40, 20, 10"

		// Using default methods to retrieve and remove elements
		Integer firstElement = arrayDeque.peekFirst();
		Integer lastElement = arrayDeque.peekLast();
		Integer removedElement = arrayDeque.pop();

		System.out.println(firstElement); // 50
		System.out.println(lastElement); // 10
		System.out.println(removedElement); // 50
		System.out.println(arrayDeque); // [40, 30, 20, 10]
	}
}
