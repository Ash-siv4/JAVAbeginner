package com.qa.daytwo;

public class loop {

	public static void forloop(int i, int e) {
		for (; i < e; i++) {
			// i++ = i+1, i-- = i-1
			System.out.println(i);
		}
	}

	public static void whileLoop() {
		int count = 2;
		System.out.println("------ while -----");
		while (count < 2) {
			count++;
			System.out.println(count);
		}
	}

	public static void doWhile() {
		int a = 2;
		System.out.println("------ do while -----");
		do {
			a++;
			System.out.println(a);
		} while (a < 2);

	}
}
