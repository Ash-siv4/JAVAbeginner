package com.qa.ExerciseSolutions;

public class Flowcharts {

	public void flow1() {
		for (int A = 100; A <= 200; A++) {
			System.out.println(A);
		}
	}

	public void flow2() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-" + A);
			} else {
				System.out.println("*" + A);
			}
		}
	}
	
	public void flow3() {
		for (int num = 1; num <= 10; num++) {
			for (int rep = 0; rep < 10; rep++) {
				System.out.println(num);
//				System.out.println(num + " : "+ rep);
			}
		}
	}

	public void flow4() {
		for (int num = 1; num <= 10; num++) {
			for (int rep = 0; rep < num; rep++) {
				System.out.println(num);
			}
		}
	}

}
