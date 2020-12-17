package com.qa.dayone;

public class ResExercise {
	
	public static int totalMarks(int Phys, int Chem, int Bio) {
		System.out.println("Physics mark: " + Phys);
		System.out.println("Chemistry mark: " + Chem);
		System.out.println("Biology mark: " + Bio);
		int sumTotal = Phys + Chem + Bio;
		System.out.println("Total mark: " + sumTotal);
		return sumTotal;
		
	}

	public static int percentMarks(int Phys, int Chem, int Bio) {
		int sum = Phys + Chem + Bio;
		int percent = (sum * 100) / 450;
		System.out.println("Percentage total: " + percent + "%");
		return percent;
	}
	
//	public static int Physics = 150;
//	public static int Chemistry = 150;
//	public static int Biology = 150;
//	public static int total = Physics + Chemistry + Biology;
//	public static int percentage = (total *100)/450;
//	
//	public static void method1() {
//		System.out.println("Physics mark: " + Physics);
//		System.out.println("Chemistry mark: " + Chemistry);
//		System.out.println("Biology mark: " + Biology);
//		System.out.println("Total mark: " + total);
//	}
//
//	public static void method2() {
//		System.out.println("Percentage total: " + percentage + "%");
//	}
	
}
