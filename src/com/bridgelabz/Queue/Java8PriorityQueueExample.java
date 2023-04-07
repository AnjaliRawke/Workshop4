package com.bridgelabz.Queue;

//creating a PriorityQueue of strings with a custom comparator to sort the elements in reverse order.
//then using streams to filter and map the data, keeping only the fruits with
// more than 5 letters and converting them to uppercase.
// Finally,using default methods of the PriorityQueue class to retrieve the head element
// and poll an element from the queue.

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Java8PriorityQueueExample {
	public static void main(String[] args) {

		// Creating a PriorityQueue of strings with a custom comparator
		PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
		priorityQueue.offer("apple");
		priorityQueue.offer("banana");
		priorityQueue.offer("cherry");
		priorityQueue.offer("durian");
		priorityQueue.offer("elderberry");

		// Using streams to filter and map the data
		String filteredString = priorityQueue.stream()
				.filter(fruit -> fruit.length() > 5)
				.map(String::toUpperCase)
				.collect(Collectors.joining(", "));

		System.out.println(filteredString);

		// Using default methods to retrieve and remove elements
		String headElement = priorityQueue.peek();
		String removedElement = priorityQueue.poll();

		System.out.println(headElement);
		System.out.println(removedElement);
		System.out.println(priorityQueue);
	}
}
