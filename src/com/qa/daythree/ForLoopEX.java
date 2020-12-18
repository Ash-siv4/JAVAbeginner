package com.qa.daythree;

import java.util.ArrayList;

public class ForLoopEX {

//	Enhanced for loop Exercises - QA Community
	// exercise 1
	public static void printArray(String[] stringArray) {
		for (String str : stringArray) {
			System.out.println(str);
		}
	}

	// exercise 2
	public static void intLoop(int[] intArray) {
		for (int i : intArray) {
			int square = i * i;
			System.out.println(i + " : " + square);
			i++;
		}
	}

	// exercise 2 - with arraylist
	public static void intLoop2() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		int position = 0;
		System.out.println("----------------------------------------------------");
		System.out.println("position" + " : " + "old value" + " : " + "new value");
		for (int i : numbers) {
			int num = i * i;
//			System.out.println(i + " : " + num);
			numbers.set(position, num);
			System.out.println(position + " : " + i + " : " + numbers.get(position));
			position++;
		}
	}

	// exercise 3
	public static void isEven(int[] evenOdd) {
		boolean bool;
		for (int i : evenOdd) {
			if (i % 2 == 0) {
				bool = true;
			} else {
				bool = false;
			}
			System.out.println(i + " : " + bool);
		}
	}

	// exercise 4
	public static void cubeSquare(int[] value) {
		int output;
		for (int i : value) {
			if (i % 2 == 0) {
				output = i * i * i;
			} else {
				output = i * i;
			}
			System.out.println(i + " : " + output);
		}
	}

}
