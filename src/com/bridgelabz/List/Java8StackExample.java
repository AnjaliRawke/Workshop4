package com.bridgelabz.List;

//creating a Stack of integers and using streams to filter and map the data,
// keeping only the even numbers and converting them to a string separated by commas.
// then using default methods of the Stack class to retrieve the top element
// and pop an element from the stack

import java.util.Stack;
import java.util.stream.Collectors;

public class Java8StackExample {
	public static void main(String[] args) {

		// Creating a Stack of integers
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		// Using streams to filter and map the data
		String filteredString = stack.stream()
				.filter(number -> number % 2 == 0)
				.map(Object::toString)
				.collect(Collectors.joining(", "));

		System.out.println(filteredString);

		// Using default methods to retrieve and remove elements
		Integer topElement = stack.peek();
		Integer poppedElement = stack.pop();

		System.out.println(topElement);
		System.out.println(poppedElement);
		System.out.println(stack);
	}
}
