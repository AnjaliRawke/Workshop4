package com.bridgelabz;

import java.util.Scanner;

public class DivisibleArray {
	int[] inputArray = new int[20];
	int[] divisibleByFive = new int[20];
	int[] divisibleBySeven = new int[20];
	int indexFive = 0;
	int indexSeven = 0;

	public void getInput() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter values: ");
		for (int i = 0; i < 20; i++) {
			inputArray[i] = userInput.nextInt();
		}
	}

	public void getDivisibleByFiveArray() {
		for (int i = 0; i < 20; i++) {
			//to check if element is divisible by 5
			if (inputArray[i] % 5 == 0) {
				divisibleByFive[indexFive] = inputArray[i];
				indexFive++;
			}
		}
	}

	public void getDivisibleBySevenArray() {
		for (int i = 0; i < 20; i++) {
			//to check if element is divisible by 7
			if (inputArray[i] % 7 == 0) {
				divisibleBySeven[indexSeven] = inputArray[i];
				indexSeven++;
			}
		}
	}

	public void printArrays() {
		//printing elements divisible by 5
		System.out.print("Elements divisible by 5 are: ");
		for (int i = 0; i < indexFive; i++) {
			System.out.print(divisibleByFive[i] + " ");
		}
		System.out.println();

		//printing elements divisible by 7
		System.out.print("Elements divisible by 7 are: ");
		for (int i = 0; i < indexSeven; i++) {
			System.out.print(divisibleBySeven[i] + " ");
		}
	}

	public static void main(String[] args) {
		DivisibleArray divisibleArray = new DivisibleArray();
		divisibleArray.getInput();
		divisibleArray.getDivisibleByFiveArray();
		divisibleArray.getDivisibleBySevenArray();
		divisibleArray.printArrays();
	}
}
